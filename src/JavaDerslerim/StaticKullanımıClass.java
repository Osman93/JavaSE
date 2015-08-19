/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class StaticKullanımıClass {
    private String ad;
    private String soyad;
    //static vs dinamik
    private int kişi=0;
    public static int sKişi;
    
    public StaticKullanımıClass(String a,String s){
    ad=a;
    soyad=s;
    sKişi++;
    kişi++;
        System.out.printf("(static)AD-SOYAD   =%s %s  klüpteki kişi sayısı %d oldu\n",ad,soyad,sKişi);
        System.out.printf("(static değil)AD-SOYAD   =%s %s  klüpteki kişi sayısı %d oldu\n",ad,soyad,kişi);
    }
    public void kur(String a,String s){
    
     ad=a;
    soyad=s;
    kişi++;
        
    
    }
}
