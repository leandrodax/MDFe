package ClassesMDFe;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Security;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class MDFeConsNaoEnc {

    private static String cacert = MDFeConsNaoEnc.class.getResource("/cacert/MDFeCacerts").getPath();
    
    public static String ConsMDFeNaoEnc(String cnpj, String TpAmbiente, String CamCertificado, String SenhaCertificado) throws MalformedURLException, SOAPException, IOException {

        
        Document xmlResposta = null;
        URL url = null;

        if (TpAmbiente.equals("1")) {
            url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFeConsNaoEnc/MDFeConsNaoEnc.asmx");
        } else if (TpAmbiente.equals("2")) {
            url = new URL("https://mdfe-homologacao.svrs.rs.gov.br/ws/MDFeConsNaoEnc/MDFeConsNaoEnc.asmx");
        }

        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");

        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.clearProperty("javax.net.ssl.keyStore");
        System.clearProperty("javax.net.ssl.keyStorePassword");
        System.clearProperty("javax.net.ssl.trustStore");

        System.setProperty("javax.net.ssl.keyStore", CamCertificado);
        System.setProperty("javax.net.ssl.keyStorePassword", SenhaCertificado);

        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
        System.setProperty("javax.net.ssl.trustStore", cacert);

        StringBuffer xml = new StringBuffer();
        xml.append("<consMDFeNaoEnc xmlns=\"http://www.portalfiscal.inf.br/mdfe\" versao=\"3.00\">")
                .append("<tpAmb>"+ TpAmbiente +"</tpAmb>")
                .append("<xServ>CONSULTAR NÃO ENCERRADOS</xServ>")
                .append("<CNPJ>"+ cnpj +"</CNPJ>")
                .append("</consMDFeNaoEnc>");

        StringBuffer requestSoap = new StringBuffer();
        requestSoap.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
                .append("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">")
                .append("<soap12:Header>")
                .append("<mdfeCabecMsg xmlns=\"http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsNaoEnc\">")
                .append("<cUF>15</cUF>")
                .append("<versaoDados>3.00</versaoDados>")
                .append("</mdfeCabecMsg>")
                .append("</soap12:Header>")
                .append("<soap12:Body>")
                .append("<mdfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsNaoEnc\">" + xml.toString() + "</mdfeDadosMsg>")
                .append("</soap12:Body>")
                .append("</soap12:Envelope>");

        //System.out.println(requestSoap.toString());
        System.out.println(xml.toString());

        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        MimeHeaders headers = new MimeHeaders();
        headers.addHeader("Content-Type", "application/soap+xml");

        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SOAPMessage msg = messageFactory.createMessage(headers, new ByteArrayInputStream(requestSoap.toString().getBytes()));

        SOAPMessage soapResponse = soapConnection.call(msg, url);
        xmlResposta = soapResponse.getSOAPBody().getOwnerDocument();
        System.out.println("xmlResposta : " + passarXMLParaString(xmlResposta)); 
        return passarXMLParaString(xmlResposta);
       
    }
    
    private static String passarXMLParaString(Document xml){
        try {
            //set up a transformer
            TransformerFactory transfac = TransformerFactory.newInstance();
            transfac.setAttribute("indent-number", new Integer(4));
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
 
            //create string from xml tree
            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(xml);
            trans.transform(source, result);
            String xmlString = sw.toString();
            return xmlString;
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }
}
