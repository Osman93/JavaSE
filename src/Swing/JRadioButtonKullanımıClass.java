/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class JRadioButtonKullanımıClass extends JFrame{
    //JTextField ekleyelim
    private JTextField tf;
    //Font değişkenleri ekleyelim..
    private Font pf;//PLAIN font
    private Font bf;//BOLD font
    private Font ıtf;//ITALIC font
    private Font bif;//BOLD+ITALIC font
    //JRadioButton ları ekleyelim hepsi herbir font için ayrı çaşılacak..
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ıb;
    private JRadioButton bib;
    //Radio butonlarını bir arada tutacak bir ButtonGroup oluşturalım..
    private ButtonGroup grup;
    
    private  JPanel panel;
    
    public JRadioButtonKullanımıClass(){//Constructor'umuzu oluşturduk...
        super("JRadioButton Kullanımı");//title'ı belirledik..
        setLayout(new FlowLayout());//Layout'u belirledik...
        
        panel=new JPanel();
        
        tf=new JTextField("Java'yı biliyorum",35);
        panel.add(tf);
        
        pb=new JRadioButton("Plain", true);
        bb=new JRadioButton("Bold", false);
        ıb=new JRadioButton("Italic", false);
        bib=new JRadioButton("Bold ve Italıc", false);
        
        panel.add(pb);
         panel.add(ıb);
           panel.add(bb);
        
         panel.add(bib);
        //Her bir JRadioButon'u ButtonGroup ile tek çatıda topladık..
        grup=new ButtonGroup();
        grup.add(pb);
        grup.add(bb);
        grup.add(ıb);
        grup.add(bib);
        
       pf=new Font("Serif", Font.PLAIN, 14);
       bf=new Font("Serif", Font.BOLD, 14);
       ıtf=new Font("Serif", Font.ITALIC, 14);
       bif=new Font("Serif",Font.BOLD+Font.ITALIC,14);
       tf.setFont(pf);
       
         
       pb.addItemListener(new HandlerClass(pf));
       bb.addItemListener(new HandlerClass(bf));
       ıb.addItemListener(new HandlerClass(ıtf));
       bib.addItemListener(new HandlerClass(bif));
       
     
       add(panel);
       
    
    
    }

    private class HandlerClass implements ItemListener {
            private Font font;
        
public HandlerClass(Font f) {
            font=f;//gelen font'u içine atıyoruz...
        }

        
        public void itemStateChanged(ItemEvent e) {
        tf.setFont(font);//Ardından font'u item değişikliğinde getiriyoruz..
        
        }
    }
}
