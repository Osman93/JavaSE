/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Random;
public class MetotlardaArrayKullanımı {
    public static void main(String [] args){
     int []dizi={1,2,3,4,5};
     değiştir(dizi);//static metodu dizi değişkeninin elemanlarını değiştirmek için çağırdık..
     for(int y:dizi){//özel for ile dizi elemanlarını yazdırıcaz..
     System.out.println(y);
     }
    }
    public static void değiştir(int x[]){//dizi elemanlarını bu metotda değiştirdik..
    Random rand=new Random();
    for(int i=0;i<x.length;i++){
        x[i]=rand.nextInt(10)+1;//1-10 arasında rastgele sayı ürettirdik..
    } 
    }
   
}
