/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class ScannerKullanımı {
       static String ad=null,soyad=null,boy=null;//Tüm proje genelinde bu değişkenleri kullanabilmek için mainin üstünde static olarak tanımladık..
       static int yaş;         
            
    public static void main(String[] args){    
    //Kullanıcıdan veri girişi almayı sağlayalım mı??
        Scanner input=new Scanner(System.in);//Scanner sınıfının nesnesi tanımladık..
        System.out.print("Adınızı girin:");
        ad=input.nextLine();//Bir satırlık istediğin kadar karakter kümesi girmemizi sağlar..
        System.out.print("Soyadınızı girin:");
        soyad=input.nextLine();
        System.out.print("Yaşınızı girin:");
        yaş=input.nextInt();// Integer değer alır kullanıcıdan ve yaş değişkeni içine atar..
        System.out.print("Boyunuzu girin:");
        boy=input.next();
        ScannerKullanımı.BilgiYaz();//parametresiz metot u çağırdık..
        
    }
    public static void BilgiYaz(){
    System.out.print("\nİsim\tSoyisim\tYaş\tBoy\n\n");//Derleyicide Kırmızı yazsın diye .err yi kullandım..
       
    System.out.print(ad+"\t"+soyad+"\t"+yaş+"\t"+boy);
    System.out.println();
    
}}
