/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class ClassMain {
    public static void main(String[] arg){
    Scanner input=new Scanner(System.in);
    double sayi;
    
    ClassDiğer nesne=new ClassDiğer();//KUllanmak istediğimiz ClassDiğer sınıfının "nesne" adında bir nesnesini oluşturduk..
    System.out.print("Dairenin yarıçapını girin:");
    sayi=input.nextDouble();
    
    nesne.yarıÇap=sayi;//ClassDiğer deki double tipindeki değişkene kullanıcıdan girdiğimiz değeri atadık böylece..
    System.out.println("Yarıçapı "+nesne.yarıÇap+" olan dairenin alanı="+nesne.daireAlan());//Burada daireAlan() metodunun sonucunu ekrana yazdık..
    System.out.println("Yarıçapı "+nesne.yarıÇap+" olan dairenin çevresi="+nesne.daireÇevre());//Burada daireÇevre() metodunun sonucunu ekrana yazdık..
    
    //Gördüğünüz gibi farklı sınıfların özelliklerini başka sınıflarda kullanabiliyoruz.Bunun için sadece kullanmak istediğimiz sınıfın nesnesini üretmek:D
    
    }
}
