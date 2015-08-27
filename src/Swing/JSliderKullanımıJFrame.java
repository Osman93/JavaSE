/**
 * @author Osman Aşar
 */
package Swing;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class JSliderKullanımıJFrame extends JFrame {
    
    private JSlider slider;
    private JSliderKullanımıJPanel panel;
    
    public JSliderKullanımıJFrame(){
    super("JSlider Kullanımı");//Burada framemimize başlık ekledik super class ile...
    
    
    
    panel=new JSliderKullanımıJPanel();
    panel.setBackground(Color.YELLOW);
    
    slider=new JSlider(SwingConstants.HORIZONTAL,0,200,10);//Burada horizontal diyerek JSlider'ı yatay yaptık minumum size 0 max size 200 ve başlangıç değerini 10 olarak tanımladık
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    
    
    slider.addChangeListener(//Slider da değişim olduğunda ne yapacağımızı burda belirteceğiz...
    
            new ChangeListener(){
            public void stateChanged(ChangeEvent e){
            
            panel.dSayısınıKur(slider.getValue());//Burada paneldeki çizimdeki d=10 değerini slider value neyse onla değiştiriyoruz bu şekilde artıp azalabiliyor..
            
            
            }
            
            
            }    
    );
    add(slider,BorderLayout.SOUTH);
    add(panel,BorderLayout.CENTER);
    
    }

 
    
    
}
