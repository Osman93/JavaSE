/**
 * @author Osman Aşar
 */
package Swing;
import java.awt.*;
import javax.swing.*;

public class JSliderKullanımıJPanel extends JPanel {
    
    private int d=10;
    
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.red);//Burada çizimimizin rengini seçtik...
    g.fillOval(10, 10, d, d);//Burada oval çizim yapoyoruz...d eni ve d boyunda yapıyoruz...İlk basta 10 a 10 
    
    }
    public void dSayısınıKur(int yeniD){
    
    d=(yeniD>=0 ? yeniD : d);
    repaint();//Burada paintComponent sınıfını tekrar yazıyoruz...
    }
   
    
}
