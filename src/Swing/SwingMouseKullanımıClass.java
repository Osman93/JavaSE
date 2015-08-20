/**
 * @author Osman Aşar
 */
package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SwingMouseKullanımıClass extends JFrame{
    private JPanel mousePanel,panel;
    private JLabel durum;
    
    public SwingMouseKullanımıClass(){
    mousePanel=new JPanel();
    mousePanel.setBackground(Color.WHITE);//Panelimizin arka planını kırmızı yaptık...
    add(mousePanel,BorderLayout.CENTER);
    
    durum=new JLabel();
    panel=new JPanel();
    panel.add(durum);
    add(panel,BorderLayout.SOUTH);
    
    HandlerClass handler=new HandlerClass();
    mousePanel.addMouseListener(handler);
    mousePanel.addMouseMotionListener(handler);
    //Arkadaşlar burda ki kontrolleri derleryip incelediğinizde daha iyi anlayacaksınız...
    
    }

    private  class HandlerClass implements MouseListener,MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            durum.setText(String.format("Fare %s %s noktasında tıklandı",e.getX(),e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            durum.setText("Fare ye basıldı..");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            durum.setText("Fare tıklandı ve ardından serbest bırakıldı..");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
       
            durum.setText("Fare giriş yaptı..");
            
          
            mousePanel.setBackground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            durum.setText("Fare Framemimizde değil..");
            mousePanel.setBackground(Color.white);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            durum.setText("Fare tıklandı ve sürükleniyor..");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
           
        }
       
    }
}
