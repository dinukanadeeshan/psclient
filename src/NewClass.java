
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DI_SH
 */
public class NewClass {

    public static void main(String[] args) {
        new Thread() {
           
          
        }.start();
        JOptionPane jOptionPane = new JOptionPane("sjdhfjhsdf");
        jOptionPane.show();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
