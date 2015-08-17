/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class BasitFaizProblemi {
    public static void main(String [] args){
    double miktar=0;
    double anapara,faiz=0.1;
    int gün;
    Scanner input=new Scanner(System.in);
    System.out.println("\tBanka Uygulaması");
    System.out.print("Yatıracağınız parayı girin:");
    anapara=input.nextDouble();
    System.out.print("Paranızın kaç gün bankada kalmasını istiyorsunuz?:");
    gün=input.nextInt();
    
    for(int i=1;i<=gün;i++){
    miktar=anapara*Math.pow(1+faiz, i);
    System.out.println("Paranız "+i+".günde "+miktar+" tl olmuştur..");
    }
    
    }
}
