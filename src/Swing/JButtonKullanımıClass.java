/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class JButtonKullanımıClass extends JFrame{
    
    private JButton standartButon;
    private JButton customButon;
    private JPanel panel;
    
    public JButtonKullanımıClass(){
    super("JButton kullanımı");//Burası başlık kısmı..
    panel=new JPanel();//Framimize direk JPanel ile ekleyeceğiz..
    standartButon = new JButton("Standart Buton");
    panel.add(standartButon);
    //Burada resim dosyalarının yolunu bulmasını sağlıyoruz..
    Icon l=new ImageIcon(getClass().getResource("l.png"));
    Icon d=new ImageIcon(getClass().getResource("d.png"));
    
    
    customButon=new JButton("Custom",d);
    customButon.setRolloverIcon(l);//Burda butonun üstünden geçtiğinde değişmesini sağlıyoruz..
    panel.add(customButon);
     
    standartButon.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null,String.format(" %s ", e.getActionCommand()));
        }
    });
    customButon.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
      
            customButon.setIcon(l);
       customButon.setRolloverIcon(d);
       JOptionPane.showMessageDialog(null,String.format(" %s ", e.getActionCommand()));
        }
    });
    
    add(panel);
    }


       
    }

