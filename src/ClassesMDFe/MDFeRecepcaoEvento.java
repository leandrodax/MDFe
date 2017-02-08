
package ClassesMDFe;

import Utilitarios.Utilitarios;
import br.inf.portalfiscal.www.mdfe.wsdl.mdferecepcaoevento.MDFeRecepcaoEventoStub;
import br.inf.portalfiscal.www.mdfe.wsdl.mdfestatusservico.MDFeStatusServicoStub;
import java.io.File;
import java.net.URL;
import java.security.Security;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.log4j.BasicConfigurator;

public class MDFeRecepcaoEvento {
    
    private static String ArquivoCacert = MDFeConsultaSitMDFe.class.getResource("/cacert/MDFeCacerts").getPath();
  
  
    
    public static String RecepcaoEventos(String XML, String CamCertificado, String SenhaCertificado,String tpAmb){
        String XMLResposta = "";
        BasicConfigurator.configure();
        Utilitarios util = new Utilitarios();
        try{
            URL url = null;
            
            if(tpAmb.equals("1")){
                url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFeRecepcaoEvento/MDFeRecepcaoEvento.asmx");
            }else if(tpAmb.equals("2")){
                url = new URL("https://mdfe-homologacao.svrs.rs.gov.br/ws/MDFeRecepcaoEvento/MDFeRecepcaoEvento.asmx");
            }
            
            /**
             * Informações do Certificado Digital.
             */
            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");

            System.clearProperty("javax.net.ssl.keyStore");
            System.clearProperty("javax.net.ssl.keyStorePassword");
            System.clearProperty("javax.net.ssl.trustStore");

            System.setProperty("javax.net.ssl.keyStore", CamCertificado);
            System.setProperty("javax.net.ssl.keyStorePassword", SenhaCertificado);

            System.setProperty("javax.net.ssl.trustStoreType", "JKS");
            System.setProperty("javax.net.ssl.trustStore", ArquivoCacert);
            
           //ler caminho do arquivo assinado
            Scanner scan = new Scanner(new File(XML));
            String XmlFileTexto = new String();
            while (scan.hasNextLine()) {
                XmlFileTexto += scan.nextLine();
            }
            
            //tira caracteres estranhos da string
            XmlFileTexto = XmlFileTexto.replaceAll("[^\\x20-\\x7e]", "");
               
           
            System.out.println("eventoMDFe : " +  XmlFileTexto);
            OMElement ome = AXIOMUtil.stringToOM(XmlFileTexto);
            
            MDFeRecepcaoEventoStub.MdfeDadosMsg dadosMsg = new MDFeRecepcaoEventoStub.MdfeDadosMsg();            
            dadosMsg.setExtraElement(ome);            
            MDFeRecepcaoEventoStub.MdfeCabecMsg mdfeCabecMsg = new MDFeRecepcaoEventoStub.MdfeCabecMsg();
            
            /**
             * Código do Estado.
             */
            mdfeCabecMsg.setCUF("15");
            
            /**
             * Versão do XML.
             */
            mdfeCabecMsg.setVersaoDados("3.00");            
            MDFeRecepcaoEventoStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeRecepcaoEventoStub.MdfeCabecMsgE();            
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);
            
            MDFeRecepcaoEventoStub stub = new MDFeRecepcaoEventoStub(url.toString());            
            MDFeRecepcaoEventoStub.MdfeRecepcaoEventoResult result = stub.mdfeRecepcaoEvento(dadosMsg, mdfeCabecMsgE);            
            XMLResposta = result.getExtraElement().toString();
            System.out.println("resp eventoMDFe : "+XMLResposta);
           //  JOptionPane.showMessageDialog(null, "resp eventoMDFe : "+XMLResposta);
        }catch(Exception e){
           e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer comunicação com servidor...\n" + e.getLocalizedMessage());
        }

        return XMLResposta;
    }
    
    
}
