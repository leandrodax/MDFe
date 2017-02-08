
package Utilitarios;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
*Classe responsável por definir o tamanho máximo de caracteres do jTextField 
*/
public class LimitaField extends PlainDocument{
   
    private int quantmax;
    private int Tipo ;
    
    /**
    *Construtor para definir os limites do campo.
    * @param 
    * limite 
    * O número de caracteres do campo;
    * @param 
    * tipo 
    * O tipo de limite do parâmetro:
    * 1 - Letras Maiúsculas;
    * 2 - Letras Minúsculas;
    * 3 - Somente Numeros;
    */
    public LimitaField(int limite, int tipo){
        quantmax = limite;
        Tipo = tipo;
    }
    
    @Override
    public  void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        if(str==null||getLength() == quantmax)
            return;
        int totalquantia =(getLength()+str.length());
        
        if(totalquantia<=quantmax && Tipo == 0){
          super.insertString(offset, str.toUpperCase(), attr);
          return;
        }else if(totalquantia<=quantmax && Tipo == 1){
          super.insertString(offset, str, attr);
          return;
        }else if(totalquantia<=quantmax && Tipo == 2){
           super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
           return;
        }
        
         String nova = str.substring(0, (getLength() - quantmax));
         super.insertString(offset, nova, attr);
        
    }
    
   
   
}
