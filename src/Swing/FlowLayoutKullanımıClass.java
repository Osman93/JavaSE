/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowLayoutKullanımıClass extends JFrame {
    
    private JButton sol;
    private JButton orta;
    private JButton sağ;
    
    private FlowLayout layout;
    
    private Container container;
    
    private JPanel panel;
    
    public FlowLayoutKullanımıClass(){
    super("FlowLayout Kullanımı");//Önce JFrame e title ekledik..
    
    layout=new FlowLayout();
    container=getContentPane();
    
    setLayout(layout);
    //FlowLayout frame size ına bağlıdır.
    sol=new JButton("sol");
    add(sol);
    sol.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
         layout.setAlignment(FlowLayout.LEFT);
         layout.layoutContainer(container);
        
        }
    });
    orta=new JButton("orta");
    add(orta);
    orta.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
         layout.setAlignment(FlowLayout.CENTER);
         layout.layoutContainer(container);
        
        }
    });
    sağ=new JButton("sağ");
    add(sağ);
    sağ.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
         layout.setAlignment(FlowLayout.RIGHT);
         layout.layoutContainer(container);
        
        }
    });
    
    
    }
    
}
