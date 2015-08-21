/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GraphicsKullanımıClass extends JPanel{
    public void paint(Graphics g){
    super.paint(g);//superclass'ı çağırdık...
    this.setBackground(Color.WHITE);
    
    g.setColor(Color.BLUE);//Çizim rengi belirliyoruz..
    g.fillRect(25, 25, 100, 30);
    
    g.setColor(new Color(125, 80, 144));//Custom renk seçimi yaptık rgb için
    g.fillRect(25, 65, 100, 30);
    
    g.setColor(Color.red);
    g.drawString("Osman Aşar", 25, 120);
    
    
    }
}
