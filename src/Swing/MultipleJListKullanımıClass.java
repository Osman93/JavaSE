/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;


public class MultipleJListKullanımıClass extends JFrame {
    private JList solList,sağList;
    private JButton buton;
    private ScrollPane r,l;
    private JPanel panel;
    private String[] dersler={"C","C++","Java","C#","Android","GUI"};
    
    
    public MultipleJListKullanımıClass(){
    
    super("Çoklu JList Kullanımı");//title oluşturduk...
    setLayout(new FlowLayout());
    
    panel=new JPanel();//Framemimize eklemeden önce diğer elemanları eklemek için..
    
    l=new ScrollPane();
    
    solList=new JList(dersler);
    solList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//Çoklu seçim listesi için MULTIPLE_INTERVAL_SELECTION u seçtik
    
    solList.setVisibleRowCount(3);// 3 tanesini 
    
    l.add(solList);
    panel.add(l);
    buton=new JButton("Yazdır-->");
    panel.add(buton);
    
    buton.addActionListener(new ActionListener() {//butona tıkladığımızda ne yapacağımızı söylüyoruz...

        @Override
        public void actionPerformed(ActionEvent e) {
        sağList.setListData(solList.getSelectedValues());//Butona tıkladığımızda solList deki seçili verileri sağList'e aktaracaktır..
        
        }
    });
   
     r=new ScrollPane();
    sağList=new JList();
    sağList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    sağList.setVisibleRowCount(3);
    r.add(sağList);
    sağList.setFixedCellWidth(100);
    sağList.setFixedCellHeight(20);
    panel.add(r);
    
    add(panel);
    }
}
