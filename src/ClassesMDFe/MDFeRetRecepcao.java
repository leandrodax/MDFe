/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMDFe;

import br.inf.portalfiscal.www.mdfe.wsdl.mdferecepcao.MDFeRecepcaoStub;
import br.inf.portalfiscal.www.mdfe.wsdl.mdferetrecepcao.MDFeRetRecepcaoStub;
import br.inf.portalfiscal.www.mdfe.wsdl.mdfestatusservico.MDFeStatusServicoStub;
import java.net.URL;
import java.security.Security;
import javax.swing.JOptionPane;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author PC
 */
public class MDFeRetRecepcao {
    
    private static String ArquivoCacert = MDFeConsultaSitMDFe.class.getResource("/cacert/MDFeCacerts").getPath();
    
    public static String RetRecepcao( String TpAmbiente, String nRec, String CamCertificado, String SenhaCertificado){
        String XMLResposta = "";
        BasicConfigurator.configure();
        try{
            
            URL url = null;
            if(TpAmbiente.equals("1")){
                url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFeRetRecepcao/MDFeRetRecepcao.asmx");
            }else if(TpAmbiente.equals("2")){
                url = new URL("https://mdfe-homologacao.svrs.rs.gov.br/ws/MDFeRetRecepcao/MDFeRetRecepcao.asmx");
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
            .append("<consReciMDFe xmlns=\"http://www.portalfiscal.inf.br/mdfe\" versao=\"3.00\">")
            .append("<tpAmb>"+TpAmbiente+"</tpAmb>")
            .append("<nRec>"+nRec+"</nRec>")
            .append("</consReciMDFe>");
 
            System.out.println("envio consReciMDFe: "+xml.toString());
            OMElement ome = AXIOMUtil.stringToOM(xml.toString());
                                  
            MDFeRetRecepcaoStub.MdfeDadosMsg dadosMsg = new MDFeRetRecepcaoStub.MdfeDadosMsg();            
            dadosMsg.setExtraElement(ome);            
            MDFeRetRecepcaoStub.MdfeCabecMsg mdfeCabecMsg = new MDFeRetRecepcaoStub.MdfeCabecMsg();
            
            /**
             * Código do Estado.
             */
            mdfeCabecMsg.setCUF("15");
            
            /**
             * Versão do XML.
             */
            mdfeCabecMsg.setVersaoDados("3.00");            
            MDFeRetRecepcaoStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeRetRecepcaoStub.MdfeCabecMsgE();
            
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);            
            MDFeRetRecepcaoStub stub = new MDFeRetRecepcaoStub(url.toString());            
            MDFeRetRecepcaoStub.MdfeRetRecepcaoResult result = stub.mdfeRetRecepcao(dadosMsg, mdfeCabecMsgE);
            
            XMLResposta = result.getExtraElement().toString();
            System.out.println("Resposta RetRecepcao: "+XMLResposta);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer comunicação com servidor...\n" + e.getLocalizedMessage());
        }
        
        return XMLResposta;
    }
    
}
