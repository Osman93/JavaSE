/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class JSliderKullanımıMain {
    public static void main(String[] args) {
            JSliderKullanımıJFrame frame = new JSliderKullanımıJFrame();
        frame.setSize(230,280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);//Bu komutla JFrame mimizin genişliğini değiştiremeyiz..
        frame.setLocation(580,200);//Ekranımızın neresinde acılacağını verdik 580 x 200 y ekseninde açılacaktır..
        
    }
}
