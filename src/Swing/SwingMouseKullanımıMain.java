/**
 * @author Osman Aşar
 */
package Swing;

import javax.swing.JFrame;
public class SwingMouseKullanımıMain {
    public static void main(String[] args) {
        SwingMouseKullanımıClass frame=new SwingMouseKullanımıClass();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
