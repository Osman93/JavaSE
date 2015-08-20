/**
 * @author Osman Aşar
 */
package Swing;

import com.sun.prism.paint.Color;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;


public class JListKullanımıClass extends JFrame{
    private JList list;
    private static String[] listElemanları={"Siyah","Beyaz","Mavi","Kırmızı","Yeşil"};
    private static Color[] renkler={Color.BLACK,Color.WHITE,Color.BLUE,Color.RED,Color.GREEN};//Burayı kullanmama imkan vermedi hata oluştuğu için switch ile yazdım..
    
    private JPanel panel;
    private ScrollPane p;
    
    public JListKullanımıClass(){//Constructor'umuzu oluşturuyoruz..
        super("JList Kullanımı");//Frame 'imizin başlığını verdik...
        setLayout(new FlowLayout());//Layoutumuzu belirledik..
        panel=new JPanel();
        p=new ScrollPane();
        list=new JList(listElemanları);
         list.setVisibleRowCount(20);//JList'te 5 elemanın görüneceğini söyledik..
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        p.add(list);
        panel.add(p);
        
        list.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
           switch(list.getSelectedIndex()){
               case 0:
                   getContentPane().setBackground(java.awt.Color.BLACK);
                   break;
                   
               case 1:
                   getContentPane().setBackground(java.awt.Color.WHITE);
                   break;
                   
                   
               case 2:
                  
                   
                   getContentPane().setBackground(java.awt.Color.BLUE);
                   break;
                   
                   
               case 3:
                   
                   getContentPane().setBackground(java.awt.Color.RED);
                   
                   break;
                   
                   
                   
               case 4:
                   getContentPane().setBackground(java.awt.Color.GREEN);
                   
                   break;
           
           
           
           }
               
            
            
            
            }
        });
    add(panel);
    
    
    }
}
