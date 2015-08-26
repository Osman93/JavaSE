/**
 * @author Osman Aşar
 */
package JApplet;
import java.awt.*;
import javax.swing.*;

public class JAppletİnitKullanımı extends JApplet {
    private double sonuç;
    
    public void init(){//Burası initialization(başlatma) yeridir..
    String sayi1String=JOptionPane.showInputDialog(null, "İlk sayiyi girin:","İlk Sayi",JOptionPane.DEFAULT_OPTION);
    String sayi2String=JOptionPane.showInputDialog(null,"İkinci sayiyi girin","İkinci sayi",JOptionPane.DEFAULT_OPTION);
    
    double sayi1=Double.parseDouble(sayi1String);
    double sayi2=Double.parseDouble(sayi2String);
    
    sonuç=sayi1+sayi2;
    
    }
    
    public void paint(Graphics g){//JApplet'e yazmak için burayı kullanıyoruz...
    super.paint(g);
    
    g.drawString("Toplam="+sonuç, 30, 30);
    
    
    }
    
    
}
