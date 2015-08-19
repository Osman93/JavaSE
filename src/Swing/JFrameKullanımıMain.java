/**
 * @author Osman Aşar
 */
package Swing;

import javax.swing.JFrame;

public class JFrameKullanımıMain {

    public static void main(String[] args) {
        JFrameKullanımıClass frame=new JFrameKullanımıClass();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Kapat tuşuna basıldığında JFramemimizin kapatılacağını söyledik..
        frame.setVisible(true);//Framimizi görmek için olmazsa olmaz bunu yazmazsanız frame'i göremezsiniz..
        frame.setSize(400, 400);
    }
    
}
