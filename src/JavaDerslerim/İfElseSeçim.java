/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class İfElseSeçim {
    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int kullanıcıSayi,kontrolSayi=10;
    //İf/Else Seçim yapısına bakalım...
        System.out.println("\t İf/Else Kullanımı");
        System.out.println("Gireceğiniz sayi "+kontrolSayi+" sayisi ile kıyaslanacaktır.");//Kıyaslama yapacağımız sayiyi ekrana yazıyoruz.
        System.out.println("Bir sayi girin:");
        kullanıcıSayi=input.nextInt();//Kullanıcıdan integerer sayi girmesini istiyoruz..
        if(kullanıcıSayi>kontrolSayi){//Burada > işaratei(Karşılaştırma Operatörü) ile eger girdiğimiz sayi 10'dan büyükse burası çalışacak..
        System.out.println("Girdiğiniz "+kullanıcıSayi+" sayısı "+kontrolSayi+" sayısından büyüktür.");
        }
        else if(kullanıcıSayi<kontrolSayi){//Burada < işaratei(Karşılaştırma Operatörü) ile eger girdiğimiz sayi 10'dan küçükse burası çalışacak..
            System.out.println("Girdiğiniz "+kullanıcıSayi+" sayısı "+kontrolSayi+" sayısından küçüktür.");
        }
        else{//Burada diğer iki koşul doğru değilse çalışacaktır BUda girdiğimiz sayi 10 a eşit olursa çalışacak demektir.
        System.out.println("Girdiğiniz "+kullanıcıSayi+" sayısı "+kontrolSayi+" sayısına eşittir.");
        }
    
    }
}
