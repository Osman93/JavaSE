/**
 * @author Osman Aşar
 */
package JApplet;
import java.net.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JAppletİnternetTarayıcısı extends JApplet {
    
    
    private HashMap<String,URL> websiteBilgi;//Burada başlıklar ve URL'yi tutmak için HAshMap'ı kullandık..
    private ArrayList<String> başlıklar;//ArrayList ile title(Başlık)'ları tutacağız...
    private JList anaListe;
    
    //BUrada tanımlamaları yapalım initilization bölümü
    public void init(){
    
    websiteBilgi=new HashMap<String,URL>();
    başlıklar=new ArrayList<String>();
    
    //HTMLbilgisiniGetir();//Burada Html sayfasındaki bilgiyi yakalamak için kullanacağız..
    
    add(new JLabel("Hangi websitesine girmek istiyorsunuz??"),BorderLayout.NORTH);//Bilgilendirme amaçlı label kullandık..
    anaListe=new JList(başlıklar.toArray());//Liste elemanlarına başlıkları aldık...
    
    anaListe.addListSelectionListener(
           new ListSelectionListener(){
             
               public void valueChanged(ListSelectionEvent e){
               
               Object object=anaListe.getSelectedValue();//Burada listede tıklanan değeri object nesnesine atacağız..
               URL yeni=websiteBilgi.get(object);//Burada listedeki başlığı url formatına aldık..
               AppletContext tarayıcı=getAppletContext();
               tarayıcı.showDocument(yeni);//Burada da gösteriyoruz..
               
               }
           
           }
    );
    
    }
}
