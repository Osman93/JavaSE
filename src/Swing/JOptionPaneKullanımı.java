/*
 * @author Osman Aşar
 */
package Swing;
import javax.swing.JOptionPane;//JOptionPane i kullanmak için bu kütüphaneyi import etmeliyiz..
public class JOptionPaneKullanımı {
    public static void main(String [] args){
    //JOptionPane.showInputDialog ile kullanıcıdan değer alıyoruz ve ekrana yazı yazabiliyoruz.
        String Değer1=JOptionPane.showInputDialog(null,"İlk sayıyı girin:","İlk Sayi",JOptionPane.DEFAULT_OPTION);
//Burda String değişkenimiz olan Değer1'e JOptionPane ile aldığımız değeri atarız..//Ayrıca başlık ve Option tipinide belirledik
        String Değer2=JOptionPane.showInputDialog(null,"İkinci sayıyı girin:","İkinci sayi",JOptionPane.DEFAULT_OPTION);
//Burda String değişkenimiz olan Değer2'ye JOptionPane ile aldığımız değeri atarız..//Ayrıca başlık ve Option tipinide belirledik
        String işlem=JOptionPane.showInputDialog(null, "Yapmak istediğiniz işlemi girin=", "İşlemler(+,-,*,/)", JOptionPane.DEFAULT_OPTION);
//Burada da toplama cıkarma çarpma  bölme hangi işlemi yapmak istediğimizi seçmemiz için girdi alıyoruz..        
        double sonuç;
        double sayi1;
        double sayi2;
        sayi1=Double.parseDouble(Değer1);//Değer1'i String olarak aldığımız için tamsayıya çeviriyoruz... 
        sayi2=Double.parseDouble(Değer2);//Değer2'yi String olarak aldığımız için tamsayıya çeviriyoruz...Çünkü işlem yapacağız.
  switch(işlem){
      case "+":
        sonuç=sayi1+sayi2;
        // JOptionPane.showMessageDialog ile geri döndürmek istediğimiz seyi işlem sonunda ekrana basabiliyoruz..Burda toplama işlemi sonucu ekrana bastık
        JOptionPane.showMessageDialog(null, "Toplama işleminizin sonucu="+sonuç,"Toplama İşlemi",JOptionPane.PLAIN_MESSAGE);
          break;
          
      case "-":
          sonuç=sayi1-sayi2;
        // JOptionPane.showMessageDialog ile geri döndürmek istediğimiz seyi işlem sonunda ekrana basabiliyoruz..Burda çıkarma işlemi sonucu ekrana bastık
        JOptionPane.showMessageDialog(null, "Çıkarma işleminizin sonucu="+sonuç,"Çıkarma İşlemi",JOptionPane.PLAIN_MESSAGE);
          break;
      case "*":
          sonuç=sayi1*sayi2;
        // JOptionPane.showMessageDialog ile geri döndürmek istediğimiz seyi işlem sonunda ekrana basabiliyoruz..Burda çarpma işlemi sonucu ekrana bastık
        JOptionPane.showMessageDialog(null, "Çarpma işleminizin sonucu="+sonuç,"Çarpma İşlemi",JOptionPane.PLAIN_MESSAGE);
          break;
          
       case "/":
           if(sayi2!=0){
          sonuç=sayi1/sayi2;
        // JOptionPane.showMessageDialog ile geri döndürmek istediğimiz seyi işlem sonunda ekrana basabiliyoruz..Burda bölme işlemi sonucu ekrana bastık
        JOptionPane.showMessageDialog(null, "Bölme işleminizin sonucu="+sonuç,"Bölme İşlemi",JOptionPane.PLAIN_MESSAGE);
           }
           else
               JOptionPane.showMessageDialog(null, "Bir sayıyı 0 ' bölmek sonsuzdur..", "Bölme işlemi", JOptionPane.DEFAULT_OPTION);
          break;   
    }
    }
}
