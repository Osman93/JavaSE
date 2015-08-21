/**
 * @author Osman Aşar
 */
package Swing;


import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.*;



import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class JColorChooserKullanımıClass extends JFrame{
    
    private JButton b;
    private Color renk=Color.WHITE;
    private JPanel panel;
    
    public JColorChooserKullanımıClass(){
    super("JClorChooser Kullanımı");
    
    panel=new JPanel();
    panel.setBackground(Color.WHITE);
    
    
    b=new JButton("ArkaPlan rengi seç");
    b.addActionListener(new ActionListener() {//butona tıklandığında ne yapacak...

        @Override
        public void actionPerformed(ActionEvent e) {
        
        renk=JColorChooser.showDialog(null, "Rengi seç", renk);//istediğimiz rengi seçmemize yarar.
        panel.setBackground(renk);//ve ordan seçtiğimiz rengi panelin arka planı olarak değiştiriyoruz.
        }
    });
    
    panel.add(b);
    add(panel);
    
    }
}
