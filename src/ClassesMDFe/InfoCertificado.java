
package ClassesMDFe;

import ClassesFirebird.InfoCertificadoBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.x509.extension.X509ExtensionUtil;



public class InfoCertificado {
    
    public static final DERObjectIdentifier RESPONSAVEL = new DERObjectIdentifier("2.16.76.1.3.2");   
    public static final DERObjectIdentifier CNPJ        = new DERObjectIdentifier("2.16.76.1.3.3");
    
    /**
    * Método para carregar as informações do certificado para os atributos da 
    * classe infoCerticadoBean.
    *  
    * @param 
    * caminhoCert
    * O caminho em que o certificado se encontra.
    * @param 
    * senhaCert 
    * A senha de acesso ao certificado.
    */
    public void CarregarCertificado(String caminhoCert, String senhaCert){
        try{
            //Pega o certificado e passa para uma stream de entrada
            InputStream entrada = new FileInputStream(new File(caminhoCert));
            //Faz uma instancia do tipo pkcs12 da chave que irá armazenar as informacoes do certificado
            KeyStore ks = KeyStore.getInstance("pkcs12");
            try{
                //Carrega o certificado, passando a senha, na chave.
                ks.load(entrada, senhaCert.toCharArray());
            } catch (IOException e) {  
                throw new Exception("Senha do Certificado Digital incorreta ou Certificado inválido.");  
            } 
            
            //Cria a variavel que irá receber o alias do certificado
            String alias = null;
            //Passa os alias do certificado que estavam guardados na keystore para uma lista enumerada
            Enumeration<String> al = ks.aliases();
            //Faz o loop de acordo com o numero de elementos da lista
            while(al.hasMoreElements()){
                alias = al.nextElement();
                //Se a chave possuir um alias do mesmo valor que passado no parametro...
                if(ks.containsAlias(alias)){
                    
                    //Mostra o caminho do certificado e seta na get da classe bean
                    System.out.println("Cert Path:" + caminhoCert);
                    InfoCertificadoBean.setCamCertificado(caminhoCert);
                    
                    //Mostra o caminho do certificado e seta na get da classe bean
                    System.out.println("Cert Senha:" + senhaCert);
                    InfoCertificadoBean.setSenha(senhaCert);
                    
                    //Mostra o alias do certificado e seta na get da classe bean
                    System.out.println("Alias Exists:" + alias);
                    InfoCertificadoBean.setAlias(alias);
                    
                    //Faz-se um objeto do X509Certificate do certificado passando o alias do mesmo
                    X509Certificate cert = (X509Certificate) ks.getCertificate(alias);
                    
                    //Mostra o numero serial do certificado e seta na get da classe bean
                    System.out.println("Numéro Serial:" + cert.getSerialNumber());
                    InfoCertificadoBean.setSerial(cert.getSerialNumber().toString());
                    
                    //Mostra a data inicial de validade do certificado e seta na get da classe bean
                    System.out.println("Válido de:" + new SimpleDateFormat("dd/MM/yyyy").format(cert.getNotBefore()));
                    InfoCertificadoBean.setValidadeInicial(new SimpleDateFormat("dd/MM/yyyy").format(cert.getNotBefore()));
                    
                    //Mostra a data final do certificado e seta na get da classe bean
                    System.out.println("Válido até:" + new SimpleDateFormat("dd/MM/yyyy").format(cert.getNotAfter()));
                    InfoCertificadoBean.setValidadeFinal(new SimpleDateFormat("dd/MM/yyyy").format(cert.getNotAfter()));
                    
                    getInfoAdicionais(cert);
                    
                    //JOptionPane.showMessageDialog(null, "Dados do Certificado Carregados Com Sucesso!");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Carregar Dados do Certificado...\n" + e.getLocalizedMessage());
        }
    }
    
    
    /**
    *Método que carrega as informações adicionais do certificado, tais como o nome do propietários e seu CNPJ.
    * 
    * @param 
    * certificate 
    * O certificado como objeto X509Certificate
    */    
    public void getInfoAdicionais(X509Certificate certificate) throws CertificateParsingException {

        info("--------------------------------------------------------");
        Collection<?> alternativeNames = X509ExtensionUtil.getSubjectAlternativeNames(certificate);
        for (Object alternativeName : alternativeNames) {
            if (alternativeName instanceof ArrayList) {
                ArrayList<?> listOfValues = (ArrayList<?>) alternativeName;
                Object value = listOfValues.get(1);
                if (value instanceof DERSequence) {
                    DERSequence derSequence = (DERSequence) value;
                    DERObjectIdentifier derObjectIdentifier = (DERObjectIdentifier) derSequence.getObjectAt(0);
                    DERTaggedObject derTaggedObject = (DERTaggedObject) derSequence.getObjectAt(1);
                    DERObject derObject = derTaggedObject.getObject();

                    String valueOfTag = "";
                    if (derObject instanceof DEROctetString) {
                        DEROctetString octet = (DEROctetString) derObject;
                        valueOfTag = new String(octet.getOctets());
                    } else if (derObject instanceof DERPrintableString) {
                        DERPrintableString octet = (DERPrintableString) derObject;
                        valueOfTag = new String(octet.getOctets());
                    } else if (derObject instanceof DERUTF8String) {
                        DERUTF8String str = (DERUTF8String) derObject;
                        valueOfTag = str.getString();
                    }

                    if ((valueOfTag != null) && (!"".equals(valueOfTag))) {
                        if (derObjectIdentifier.equals(RESPONSAVEL)) {
                            System.out.println("Nome do Responsavel: " + derObjectIdentifier + " - " + valueOfTag);
                            InfoCertificadoBean.setNomePropietario(valueOfTag);
                        } else if (derObjectIdentifier.equals(CNPJ)) {
                            System.out.println("CNPJ...............: " + derObjectIdentifier + " - " + valueOfTag);
                            InfoCertificadoBean.setCNPJ(valueOfTag);
                        }
                    }
                }
            }
        }
    }
    
    private static void info(String info) {
        System.out.println("| INFO: " + info);
    }
   
}
