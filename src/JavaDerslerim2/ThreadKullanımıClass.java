/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;

public class ThreadKullanımıClass implements Runnable {

   private String isim;
   private int zaman;
   Random rand=new Random();
    
    public ThreadKullanımıClass(String x){
    isim=x;
    zaman=rand.nextInt(10000);
    
    }
    
    @Override
    public void run() {
        try{
            System.out.printf("%s thread %d saniye uyudu\n", isim,zaman);
            Thread.sleep(zaman);//yapılan işlemi uyutmak için kullanır..
            System.out.printf("%s thread'in işlemi bitti\n", isim);
        
        }catch(Exception e){
        
        }
    }
    
}
