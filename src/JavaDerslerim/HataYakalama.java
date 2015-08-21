/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.util.Scanner;


public class HataYakalama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2;
        
        try{
        System.out.print("İlk sayıyı girin:");
        sayi1=input.nextInt();
        System.out.print("İkinci sayıyı girin:");
        sayi2=input.nextInt();
        System.out.println("Bu iki sayının bölümü="+(sayi1/sayi2));
        }catch(Exception e){
        
       System.err.println("Bir sayi 0 a bölünmez..");//Gördüğünüz gibi hatayı ayıklamak için bu bölümleri try ve catch içinde yazıyoruz..
               
        }
        
    }
}
