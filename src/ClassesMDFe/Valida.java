/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMDFe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;  
import java.net.URISyntaxException;
import java.net.URL;  
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.XMLConstants;
  
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;  
import javax.xml.validation.Schema;  
import javax.xml.validation.SchemaFactory;  
import javax.xml.validation.Validator;  
  
import org.xml.sax.InputSource;  
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;  
  
public class Valida  
{
    
    public static void main(String[] args){
      try {
        try {
          System.out.println(ValidaDocXML("C:/InterageSE/MDFe_XML/ArquivoMDFe.xml", "mdfe_v3.00.xsd"));
        } catch (IOException ex) {
          Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
          Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
        }
      } catch (URISyntaxException ex) {
        Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SAXException ex) {
        Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    public static String ValidaDocXML(String ArquivoXml, String xsdFileName) throws URISyntaxException, SAXException, FileNotFoundException, IOException, ParserConfigurationException  
    {  
        //Define o tipo de  - we use W3C  
        //String schemaLang = "hhttp://www.w3.org/2001/XMLSchema";  
        //valida driver  
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);  
        //  
           
          
            URL xsdPath = Valida.class.getResource("/schemas/" + xsdFileName);  
  
            Schema schema = factory.newSchema(new StreamSource(xsdPath.toURI().toString()));  
            Validator validator = schema.newValidator();  
            //Perform the validation:  
            Scanner scan = new Scanner(new File(ArquivoXml));
            String xml = new String();
            while (scan.hasNextLine()) {
                xml += scan.nextLine();
            }
            
            //tira caracteres estranhos da string
            xml = xml.replaceAll("[^\\x20-\\x7e]", "");
            System.out.println(xml);
            validator.validate(new StreamSource(new StringReader(xml)));  
            DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder = fact.newDocumentBuilder();  
            builder.parse(new InputSource(new StringReader(xml)));  
            
            JOptionPane.showMessageDialog(null, "Validado com Sucesso!");
          
          
        return "";  
    }  
    
    public static String validaPedCartaCorrecao(String stringXml) throws URISyntaxException, SAXException, IOException, FileNotFoundException, ParserConfigurationException {  
        return ValidaDocXML(stringXml, "envCCe_v1.00.xsd");  
    }  
      
    public static String validaRetCartaCorrecao(String stringXml) throws URISyntaxException {  
      try {  
        return ValidaDocXML(stringXml, "retEnvCCe_v1.00.xsd");
      } catch (SAXException ex) {
        Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
        Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ParserConfigurationException ex) {
        Logger.getLogger(Valida.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
    }
}  
      

