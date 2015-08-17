/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.util.Scanner;
public class MantıksalOperatörler {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("\t Mantıksal Operatör Kullanımı");
        System.out.println("AND operatörünü çalıştırmak için 1-10 arasında sayi girin");
        System.out.println("OR operatörünü çaliştirmak için 0 dan küçük veya 10 dan büyük sayi girin");
        System.out.println("15 den farklı gireceğiniz her sayi NOT operatörünü çalıştıracaktır");
        System.out.println("Şimdi Bir sayi girin:");
        sayi=input.nextInt();
    //Mantıksal operatörlere bakalım
       if(sayi>=1 && sayi<=10){
       System.out.println("Şuan AND Operatörüne girdin çünkü 1-10 arasında bir değer girdin");
       }
       else if(sayi<0 || sayi>10){
           System.out.println("Suan OR Operatöründesin çünkü ya 0 dan küçük sayi girdin yada 10 dan büyük");
       }
       if(!(sayi==15)){
       System.out.println("15 den farklı bir sayi girerek NOT operatörünü çalıştırdın");
       }
        
   
    
    }
}
