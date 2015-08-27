/**
 * @author Osman Aşar
 */
package JavaDerslerim2;


public class ThreadKullanımıMain {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadKullanımıClass("Birinci"));
        Thread t2=new Thread(new ThreadKullanımıClass("İkinci"));
        Thread t3=new Thread(new ThreadKullanımıClass("Üçüncü"));
        Thread t4=new Thread(new ThreadKullanımıClass("Dördüncü"));
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        //compile edildikten sonra her işlem hemen hemen eş zamanlı çalıştığını görebilirsiniz işte thread işlemleri eş zamanlı yapmaya çalısır..
    }
}
