/**
 * @author Osman 
 */
package JavaDerslerim;
import java.util.Scanner;

public class BasitOrtalamaAlmaProgramı {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int[]dizi;
    dizi=new int[10];//10 elemanlı dizi tanımladık..
    int toplam=0;
    int i;
    for(i=0;i<10;i++){
        System.out.print((i+1)+".sayiyi girin:");
        dizi[i]=input.nextInt();
        toplam+=dizi[i];
    }
    System.out.println("Toplam="+toplam);
       
        System.out.println("Ortalama="+(toplam/(i)));
    
    }
}
