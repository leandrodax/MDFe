
package ClassesMDFe;

import br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsulta.MDFeConsultaStub;
import java.net.URL;
import java.security.Security;
import javax.swing.JOptionPane;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.log4j.BasicConfigurator;

public class MDFeConsultaSitMDFe {
    
    private static String ArquivoCacert = MDFeConsultaSitMDFe.class.getResource("/cacert/MDFeCacerts").getPath();
    
    public static String ConsultaSitMDFe(String Chave, String TpAmbiente, String CamCertificado, String SenhaCertificado){
        String XMLResposta = "";
        BasicConfigurator.configure();
        try{
            URL url = null;

            /*
            * Escolhe o tipo de ambiente de acordo com o valor do parâmetro
            */
            if (TpAmbiente.equals("1")) {
                url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFeConsulta/MDFeConsulta.asmx");
            } else if (TpAmbiente.equals("2")){
                url = new URL("https://mdfe-homologacao.svrs.rs.gov.br/ws/MDFeConsulta/MDFeConsulta.asmx");
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
            OMElement ome = AXIOMUtil.stringToOM("<consSitMDFe versao=\"3.00\" xmlns=\"http://www.portalfiscal.inf.br/mdfe\">" +
                                                 "<tpAmb>"+ TpAmbiente +"</tpAmb>" +
                                                 "<xServ>CONSULTAR</xServ>" +
                                                 "<chMDFe>"+ Chave +"</chMDFe>" +
                                                 "</consSitMDFe>");
            
            MDFeConsultaStub.MdfeDadosMsg dadosMsg = new MDFeConsultaStub.MdfeDadosMsg();
            
            dadosMsg.setExtraElement(ome);
            
            MDFeConsultaStub.MdfeCabecMsg mdfeCabecMsg = new MDFeConsultaStub.MdfeCabecMsg();
            
            /**
             * Código do Estado.
             */
            mdfeCabecMsg.setCUF("15");
            
            /**
             * Versão do XML.
             */
            mdfeCabecMsg.setVersaoDados("3.00");
            
            MDFeConsultaStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeConsultaStub.MdfeCabecMsgE();
            
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);
            
            MDFeConsultaStub stub = new MDFeConsultaStub(url.toString());
            
            MDFeConsultaStub.MdfeConsultaMDFResult result = stub.mdfeConsultaMDF(dadosMsg, mdfeCabecMsgE);
            
            XMLResposta = result.getExtraElement().toString();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer comunicação com servidor...\n" + e.getLocalizedMessage());
        }
        
        return  XMLResposta;
    }
    
}
