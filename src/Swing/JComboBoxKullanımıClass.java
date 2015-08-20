/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxKullanımıClass extends JFrame{//JFrame 'den miras alalım..
    private JComboBox box;
    private JLabel resim;
    private String[] dosyaAdı={"Beğendi","Beğenmedi"};
    //Burada iconları resimleri bulmalarını söyledik..
    private Icon[] r={new ImageIcon(getClass().getResource("l.png")),new ImageIcon(getClass().getResource("d.png"))};
    
    private JPanel panel;
    
    public JComboBoxKullanımıClass(){//Yapıcımızı oluşturduk bu class için
        super("JComboBox Kullanımı");//
        setLayout(new FlowLayout());//Layout'umuzu tanımladık...
        panel=new JPanel();
        box=new JComboBox(dosyaAdı);
        
        box.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.SELECTED){
            resim.setIcon(r[box.getSelectedIndex()]);//Burda hangi box elemanı seçilirse ona göre icon değiştir dedik..
            
            }
            
            }
        });
     panel.add(box);
     resim=new JLabel(r[0]);
        panel.add(resim);
     
     
     add(panel);
        
    
    
    
    
    }


}
