/**
 * @author Osman Aşar
 */
package JApplet;

import java.awt.*;
import javax.swing.*;
public class JAppletKullanımıBaşlangıç extends JApplet{//JApplet kullanabilmek için sınıfımızda miras almamız lazım..
    
    public void paint(Graphics g){
    super.paint(g);
    
    g.drawString("Osman Aşar", 25, 25);//Ardından AppletViewer'da bu yazıyı göstermek için bunu kullandık...
    
    }
            
}
