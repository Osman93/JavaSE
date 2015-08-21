/**
 * @author Osman Aşar
 */
package Swing;

import javax.swing.JFrame;


public class JColorChooserKullanımıMain extends JFrame {
    public static void main(String[] args) {
        JColorChooserKullanımıClass frame=new JColorChooserKullanımıClass();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
