/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JCheckBoxKullanımıClass extends JFrame{
    
    private JTextField tf;
    private JCheckBox boldBox;
    private JCheckBox italicBox;
    private JPanel panel;
    
    public JCheckBoxKullanımıClass(){//Hemen constructor oluşturuyoruz...
    super("JCheckBox Kullanımı");//title oluşturduk frame 'imiz için...
    panel = new JPanel();
    tf=new JTextField("Metin gir",14);//14 genişliğinde içinde "Metin gir " yazan JTextField tanımladık
    tf.setFont(new Font("Serif", Font.PLAIN, 14));//burada yazı sitilini ayarladık
   panel.add(tf);
 
    boldBox=new JCheckBox("Bold");
    italicBox=new JCheckBox("italic");
    panel.add(boldBox);
    panel.add(italicBox);
    HandlerClass handler=new HandlerClass();
    boldBox.addItemListener(handler);
    italicBox.addItemListener(handler);
    add(panel);
    }

    private  class HandlerClass implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font=null;
            //Bu kısmda hangi checkBox seçilecekse ona göre yazıya yeni font vermesini söyledik..
            if(boldBox.isSelected() && italicBox.isSelected() ){
            font=new Font("Serif", Font.BOLD+Font.ITALIC, 14);
            
            }else
                if(boldBox.isSelected()  ){
            font=new Font("Serif", Font.BOLD, 14);
            
            }else
                    if( italicBox.isSelected() ){
            font=new Font("Serif",Font.ITALIC, 14);
            
            }else{
                    
                    font=new Font("Serif", Font.PLAIN, 14);
                    }
            tf.setFont(font);
        }

       
    }
    
}
