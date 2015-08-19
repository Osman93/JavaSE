/**
 * @author Osman Aşar
 */
package Swing;
import java.awt.FlowLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ActionListenerClass extends JFrame {
    
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    
    private JPasswordField password;
   
    private JPanel panel;
    
    public ActionListenerClass(){
    super("JFrame başlığı");
    panel=new JPanel();//Bütün alanları bir anda frame mimize eklemek için panel oluşturduk...
    
    item1=new JTextField(20);//İçindeki parametre genişliğini verir
    panel.add(item1);
    
    item2 =new JTextField("Yazı Girin:");
    panel.add(item2);
    
    item3=new JTextField("Değiştirilemez",20);//ilk parametre ekrana yazıyı yazar diğer parametre ise genişlik uzunluğudur..
    item3.setEditable(false);//setEditable(false) ile artık bu textField 'ın değiştirilemeyeceğini anlıyoruz..
    panel.add(item3);
    
    password=new JPasswordField("Şifrem");
    panel.add(password);
    add(panel);//Framimize textfield ve passworField ile dolu panelimizi ekledik..
    theHandler handler=new theHandler();
    item1.addActionListener(handler);
    item2.addActionListener(handler);
    item3.addActionListener(handler);
    password.addActionListener(handler);
    
    
    }
    private class theHandler implements ActionListener{//theHandler Class'ımızı ActionListener Class'ı gibi kullanmak istediğimizde implements ederiz..

        @Override
        public void actionPerformed(ActionEvent e) {
            String s=null;
            if(e.getSource()==item1){//getSource ile theHandler Clasından üretilen nesnenin hangi kaynağı aldını bulmaya yarar.Burda item1 yakaladığında ne yapacağını belirtir.
            s=String.format("Alan1:%s", e.getActionCommand());
            }else
                if(e.getSource()==item2){//getSource ile theHandler Clasından üretilen nesnenin hangi kaynağı aldını bulmaya yarar.Burda item2 yakaladığında ne yapacağını belirtir.
                 s=String.format("Alan2:%s", e.getActionCommand());
                }else
                    if(e.getSource()==item3){//getSource ile theHandler Clasından üretilen nesnenin hangi kaynağı aldını bulmaya yarar.Burda item3 yakaladığında ne yapacağını belirtir.
                     s=String.format("Alan3:%s", e.getActionCommand());
                    
                    }else
                        if(e.getSource()==password){//getSource ile theHandler Clasından üretilen nesnenin hangi kaynağı aldını bulmaya yarar.Burda password yakaladığında ne yapacağını belirtir.
                         s=String.format("Password:%s", e.getActionCommand());
                        
                        }
            
            JOptionPane.showMessageDialog(null, s);//ardından JOptionPane ile alanlarda ne yazdığımızı görebiliyoruz..
            
            }
        }
    
    
    
    }
