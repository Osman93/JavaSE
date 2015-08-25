/*
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Faktoriyeli alınacak sayıyı girin:");
        long sayi,hesap;
        sayi=input.nextLong();
        
       hesap=fact(sayi);
        System.out.println(sayi+"!="+hesap);
        
    }
    
    public static long fact(long s){
   
        
    if(s<=1){
    
    return 1;
    }
    else{
    
    return s*fact(s-1);//işte burda metot recursive durumdadır kendi içinde kendini çağıracaktır..
    }
    
    
    
    }
}
