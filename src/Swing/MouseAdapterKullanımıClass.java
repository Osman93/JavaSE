/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseAdapterKullanımıClass extends JFrame {
    
    private String yazı;
    private JLabel label;
    
    public MouseAdapterKullanımıClass(){
    super("MouseAdapter Kullanımı");
    
    label=new JLabel("Default Layout");
    add(label,BorderLayout.SOUTH);
    addMouseListener(new MouseClass());
    
    
    
    
    
    }

    private  class MouseClass extends MouseAdapter {
      public void mouseClicked(MouseEvent e){
      yazı=String.format("%d kez tıklandı",e.getClickCount() );
      if(e.isMetaDown()){
      
      yazı+=" mouse'un sağ tuşuyla..";
      
      }else
          if(e.isAltDown()){
          yazı+=" mouse'un orta tuşuyla..";
          }else{
          
          yazı+=" mouse'un sol tuşuyla";
          }
      label.setText(yazı);
      }
       
    }
    
}
