/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameKullanımıClass extends JFrame {//Burada classımıza JFrame classından miras almasını sağladık..
    private JLabel label;//JLabel metin resim gibi bileşenleri Framemimize eklememizi sağlar..
   public JFrameKullanımıClass(){
       super("Başlık Kısmı");//Bu şekilde başlık eklenir yada JFrame_nesneAdi.setTittle(); şeklindede olabilir.
       
       
       setLayout(new FlowLayout());//Layout olarak frame de FlowLayout'u seçtik..
       label=new JLabel("Angelina Joile");//Jlabel text yazdırdık..
       label.setToolTipText("Brad Pitt ile evli üzgünüz");//burda ise o labelde beklendiğinde gölgesinde yazacak metni girdik..
       
       add(label);//Framimize ekledik..
       
       
       
   
   
   } 
}
