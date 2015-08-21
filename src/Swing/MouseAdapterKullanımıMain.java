/**
 * @author Osman Aşar
 */
package Swing;

import javax.swing.JFrame;

public class MouseAdapterKullanımıMain {
    public static void main(String[] args) {
        MouseAdapterKullanımıClass frame=new MouseAdapterKullanımıClass();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
