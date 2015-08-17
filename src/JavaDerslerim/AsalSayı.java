/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.time.Clock;
import java.util.Scanner;
public class AsalSayı {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int sayi,bolen=0;
    System.out.println("\t\tAsal Mı??");
    System.out.print("Bir sayi girin:");
    sayi=input.nextInt();
    
    for(int i=2;i<=sayi/2;i++){//Burada yaptığım şey bizim sayi 2 ye bölünebilir yani sayi/2 büyük böleni olamaz..
    if(sayi%i==0)//Burada da eğer bölen bir sayi çikarsa bolen sayacımız hep artacak 
        bolen++;
    }
    if(bolen!=0)//bolen 0 dan farklysa demekki bölündü ve asal değil
        System.out.print("Asal değil");
    else//ancak bolen 0 ise demekki bölünmedi ve asal
        System.out.print("asal");
    }
}
