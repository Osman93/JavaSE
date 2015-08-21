/**
 * @author Osman Aşar
 */
package Swing;

import javax.swing.JFrame;


public class GraphicsKullanımıMain {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Graphics Kullanımı");//Burada frame'e title verdik...
        GraphicsKullanımıClass grap=new GraphicsKullanımıClass();
        frame.add(grap);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
