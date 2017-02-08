package mdfe;

import Utilitarios.Utilitarios;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MDFe {

    public static void main(String[] args) {

        Utilitarios util = new Utilitarios();
        
        try {
           
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            UIManager.put("PopupMenu.background", new Color(0));
            UIManager.put("PopupMenu.border", BorderFactory.createLineBorder(Color.BLUE));

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MDFe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MDFe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MDFe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MDFe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        util.AtualizaTabelas();

        new TelaLogin().setVisible(true);
    }

}
