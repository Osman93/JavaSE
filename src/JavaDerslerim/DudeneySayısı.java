/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.util.Scanner;

public class DudeneySayısı {
    public static void main(String[] arg){
    Scanner input=new Scanner(System.in);
    String sayi;
    int toplam=0;
    System.out.println("\tDudeney sayısı mı??");
    System.out.print("Bir sayi girin:");
    sayi=input.next();
    char basamak;
    int b;
    for(int i=0;i<sayi.length();i++){
         
         b=Character.getNumericValue(sayi.charAt(i));
    
         toplam+=Math.pow(b, 3);
    }
    int yedek;
    yedek=Integer.parseInt(sayi);
    if(toplam==yedek)
        System.out.print("Dudeney sayi");
    else
        System.out.print("Dudeney sayi değil");
    }
}
