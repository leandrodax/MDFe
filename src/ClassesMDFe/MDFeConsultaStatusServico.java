
package ClassesMDFe;

import br.inf.portalfiscal.www.mdfe.wsdl.mdfestatusservico.MDFeStatusServicoStub;
import java.net.URL;
import java.security.Security;
import javax.swing.JOptionPane;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.log4j.BasicConfigurator;

public class MDFeConsultaStatusServico {
    
    private static String ArquivoCacert = MDFeConsultaStatusServico.class.getResource("/cacert/MDFeCacerts").getPath();

    public static String ConsultaStatusServico(String TpAmbiente, String CamCertificado, String SenhaCertificado){
        String XMLResposta = "";
        BasicConfigurator.configure();
        try{
            URL url = null;

            if (TpAmbiente.equals("1")) {
                url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFeStatusServico/MDFeStatusServico.asmx");
            } else if (TpAmbiente.equals("2")){
                url = new URL("https://mdfe-homologacao.svrs.rs.gov.br/ws/MDFeStatusServico/MDFeStatusServico.asmx");
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
            
            /**
             * Xml de Consulta.
             */
            StringBuilder xml = new StringBuilder();

            xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                    .append("<consStatServMDFe xmlns=\"http://www.portalfiscal.inf.br/mdfe\" versao=\"3.00\">")
                    .append("<tpAmb>"+TpAmbiente+"</tpAmb>")
                    .append("<xServ>STATUS</xServ>")
                    .append("</consStatServMDFe>");
 
            System.out.println(xml.toString());
            OMElement ome = AXIOMUtil.stringToOM(xml.toString());
            
                     
            MDFeStatusServicoStub.MdfeDadosMsg dadosMsg = new MDFeStatusServicoStub.MdfeDadosMsg();            
            dadosMsg.setExtraElement(ome);            
            MDFeStatusServicoStub.MdfeCabecMsg mdfeCabecMsg = new MDFeStatusServicoStub.MdfeCabecMsg();
            
            /**
             * Código do Estado.
             */
            mdfeCabecMsg.setCUF("15");
            
            /**
             * Versão do XML.
             */
            mdfeCabecMsg.setVersaoDados("3.00");
            
            MDFeStatusServicoStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeStatusServicoStub.MdfeCabecMsgE();
            
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);
            
            MDFeStatusServicoStub stub = new MDFeStatusServicoStub(url.toString());
            
            MDFeStatusServicoStub.MdfeStatusServicoMDFResult result = stub.mdfeStatusServicoMDF(dadosMsg, mdfeCabecMsgE);
            
            XMLResposta = result.getExtraElement().toString();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer comunicação com servidor...\n" + e.getLocalizedMessage());
        }
        
        return XMLResposta;
    } 
    
}
