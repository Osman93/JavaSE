/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class TernaryOperatör {
    public static void main(String [] args){
    Scanner input=new Scanner(System.in);
        int yaş;
        
        System.out.print("Yaşınızı girin:");
        yaş=input.nextInt();
        
        System.out.println((yaş>=50)?"Yaşlısınız":"Gençsiniz");
//Gördüğünüz gibi ternary operatör if/else yapısı gibi çalışıyor 
        //yaş değişkeni 50'den büyük ise ekrana "Yaşlısınız" yazıyor..
        //yaş değişkeni 50'den küçük ise ekrana "Gençsiniz " yazıyor..
    
    }
}
