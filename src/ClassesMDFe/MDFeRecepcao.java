package ClassesMDFe;

import br.inf.portalfiscal.www.mdfe.wsdl.mdferecepcao.MDFeRecepcaoStub;
import br.inf.portalfiscal.www.mdfe.wsdl.mdfestatusservico.MDFeStatusServicoStub;
import java.io.File;
import java.net.URL;
import java.security.Security;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.log4j.BasicConfigurator;

public class MDFeRecepcao {

    /*159000002856247*/
    
    private static String ArquivoCacert = MDFeConsultaSitMDFe.class.getResource("/cacert/MDFeCacerts").getPath();
    
    public static String Recepcao(String ArquivoXml, String TpAmbiente, String idLote, String CamCertificado, String SenhaCertificado){
        String XMLResposta = "";
        BasicConfigurator.configure();
        try{
            
            URL url = null;

            /*
            * Escolhe o tipo de ambiente de acordo com o valor do parâmetro
            */
            if (TpAmbiente.equals("1")) {
                url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFerecepcao/MDFeRecepcao.asmx");
            } else if (TpAmbiente.equals("2")){
                url = new URL("https://mdfe-homologacao.svrs.rs.gov.br/ws/MDFerecepcao/MDFeRecepcao.asmx");
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
            Scanner scan = new Scanner(new File(ArquivoXml));
            String XmlFileTesto = new String();
            while (scan.hasNextLine()) {
                XmlFileTesto += scan.nextLine();
            }
            
            //Estava dando erro na assinatura
            //XmlFileTesto = XmlFileTesto.replaceAll("[^\\x20-\\x7e]", "");
            System.out.println(XmlFileTesto);
            
            
             /**
             * Xml de Consulta.
             */
            StringBuilder xml = new StringBuilder();

            xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                    .append("<enviMDFe xmlns=\"http://www.portalfiscal.inf.br/mdfe\" versao=\"3.00\">")
                    .append("<idLote>"+idLote+"</idLote>")
                    .append(XmlFileTesto)
                    .append("</enviMDFe>");
 
            System.out.println("enviMDFe : "+xml.toString());
            OMElement ome = AXIOMUtil.stringToOM(xml.toString());
            
                     
            MDFeRecepcaoStub.MdfeDadosMsg dadosMsg = new MDFeRecepcaoStub.MdfeDadosMsg();            
            dadosMsg.setExtraElement(ome);            
            MDFeRecepcaoStub.MdfeCabecMsg mdfeCabecMsg = new MDFeRecepcaoStub.MdfeCabecMsg();
                       
         
            
            /**
             * Código do Estado.
             */
            mdfeCabecMsg.setCUF("15");
            
            /**
             * Versão do XML.
             */
            mdfeCabecMsg.setVersaoDados("3.00");            
            MDFeRecepcaoStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeRecepcaoStub.MdfeCabecMsgE();            
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);
            
            MDFeRecepcaoStub stub = new MDFeRecepcaoStub(url.toString());            
            MDFeRecepcaoStub.MdfeRecepcaoLoteResult result = stub.mdfeRecepcaoLote(dadosMsg, mdfeCabecMsgE);            
            XMLResposta = result.getExtraElement().toString();
            System.out.println("Resposta recepcao: " + XMLResposta);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer comunicação com servidor...\n" + e.getLocalizedMessage());
        }
        
        return XMLResposta;
    }

}
