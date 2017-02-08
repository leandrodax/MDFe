
package ClassesMDFe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Assina {
    
    
    /**
    *
    * Método usado para assinar o XML com o certificado carregado.
    *
    *@param 
    * camXML 
    * O caminho do XML que irá ser assinado;
    * @param 
    * camXMLAssinado 
    * Nome e caminho aonde o xml assinado será gerado;
    * @param 
    * aliasCert 
    * O alias pertencente ao Certificado
    * @param 
    * camCert 
    * O caminho do Certificado que será usado para fazer a assinatura;
    * @param 
    * senhaCert 
    * A senha do Certificado que será usado para fazer a assinatura;
    * 
    * @return 
    * Uma String com o caminho do XML Assinado.
    */
    public static String GerarAssinatura(String camXML, String camXMLAssinado, String aliasCert, String camCert, String senhaCert, String TagInf, String Cabecalho, String Arquivo) throws SAXException, IOException, ParserConfigurationException, NoSuchAlgorithmException, CertificateException, UnrecoverableEntryException, Exception {
        String XMLAssinado = null;
        
          
            //Gera um instancia da factory de DocumentBuilder 
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            //Tambem se torna conhecido o espaco de nome do xml
            dbf.setNamespaceAware(true);
            
            //Cria um DocumentBuilder através da factory instanciada
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = null;
            //Converte o arquivo(XML) em um Document(DOM)
            if(Arquivo.equals("S")){
                doc = builder.parse(new File(camXML));
            }else if(Arquivo.equals("N")){
                doc = builder.parse(new InputSource(new StringReader(camXML)));
            }
            
            
            
            //Gera uma instancia do gerador de pares de chave com o algoritimo DSA
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("DSA");
            
            //Inicializa com o tamanho dos pares
            kpg.initialize(512);
            
            //Gera um par de chaves
            KeyPair kp = kpg.generateKeyPair();
            
            //Faz um keystore do tipo pkcs12
            KeyStore ks = KeyStore.getInstance("pkcs12");
            
            //Pega o alias do certificado
            String alias = aliasCert;

            try {
                //Gera uma stream de entrada com o caminho do certificado
                InputStream entrada = new FileInputStream(camCert);
                
                //Carrega as informações do certificado 
                ks.load(entrada, senhaCert.toCharArray());

                //Verifica se a keystore possui uma entrada com o alias e senha do certificado
                if (ks.getEntry(alias, new KeyStore.PasswordProtection(senhaCert.toCharArray())) == null) {
                    throw new Exception("Alias não existe!");
                }

            } catch (IOException e) {
                throw new Exception("Senha do Certificado Digital incorreta ou Certificado inválido!");
            }

            //Gera uma entrada de chaves privadas do certificado informado
            KeyStore.PrivateKeyEntry keyEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(senhaCert.toCharArray()));
            
            //Gera um contexto de assinatura(DOM) passado as informacoes da chave de entrada e o documento(DOM) do XML
            DOMSignContext dsc = new DOMSignContext(keyEntry.getPrivateKey(), doc.getDocumentElement());
            
            //Gera uma instancia da factory de Assina de XML  
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            //Gera uma factory de informacoes da chave 
            KeyInfoFactory kif = fac.getKeyInfoFactory();

            //Faz uma lista
            List transforms = new ArrayList();
            
            //Adiciona informações referente a assinatura na lista
            transforms.add(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
            transforms.add(fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null));

           
            //Faz uma lista de nós do elemento 'infMDFe' do XML
            NodeList elements = doc.getElementsByTagName(TagInf);
            //Pega apenas o primeiro elemnto da lista
            Element el = (Element) elements.item(0);
            //Pega o atributo desde elemento como uma String
            String Id = el.getAttribute("Id");
            //Seta o atributo como Id
            el.setIdAttribute("Id", true);

            //Gera uma referencia passando como parametro o id pego do XML
            Reference ref = fac.newReference("#" + Id, //
                    fac.newDigestMethod(DigestMethod.SHA1, null),//
                    transforms, null, null);

            //Gera a informaçao da assinatura
            SignedInfo si = fac.newSignedInfo(//
                    fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, //
                            (C14NMethodParameterSpec) null), //
                    fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),//
                    Collections.singletonList(ref));

            //Faz uma nova lista
            List x509Content = new ArrayList();
            //Adiciona as informaçoes do certificado na lista
            x509Content.add(keyEntry.getCertificate());

            //Gera um X509Data com o conteudo da lista
            X509Data kv = kif.newX509Data(x509Content);
            
            //Gera as informacoes da chave com o X509Data
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(kv));
            
            //Faz uma Assina XML com as informacoes da assinatura e as informacoes da chave
            XMLSignature signature = fac.newXMLSignature(si, ki);

            //Assina o documento
            signature.sign(dsc);

            OutputStream os = null;

            os = new FileOutputStream(new File(camXMLAssinado));

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            
            
            if(Cabecalho.equals("S")){
              
            }else{
               //TIRA O CABECALHO DO XML
               trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            }
            
            StreamResult result = new StreamResult(os);  
             
            trans.transform(new DOMSource(doc), result);

            //JOptionPane.showMessageDialog(null, "XML Assinado!");

            XMLAssinado = camXMLAssinado;
            

        return XMLAssinado;
    } 
    
}
