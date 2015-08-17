/**
 * @author Osman Aşar
 */

package JavaDerslerim;
import java.time.Clock;
import java.util.Random;
public class RandomGenerator {
    public static void main(String [] args){
    Random rand=new Random();//Random sınıfının nesnesini ürettik kullanabilmek için
    int sayi;
    System.out.println("\t0-99 arası üretilen rastgele sayılar");
    for(int i=1;i<=10;i++){
    sayi=rand.nextInt(100);
        System.out.print(sayi+"  ");
    }
    System.out.println("\n\t1-100 arası üretilen rastgele sayılar");
    for(int i=1;i<=10;i++){
    sayi=rand.nextInt(100)+1;
        System.out.print(sayi+"  ");
    }
    
    
    }
}
