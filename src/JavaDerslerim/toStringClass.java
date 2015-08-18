/**
 * @author Osman Aşar
 */
package JavaDerslerim;


public class toStringClass {
    private int gün;
    private int ay;
    private int yıl;
    
    public toStringClass(int g,int a,int y){//constructor oluşturduk 3 parametreli...
    gün=g;
    ay=a;
    yıl=y;
    
        System.err.printf("Yapıcımız çalıştı ve sonuç=%s",this);//Burda C programlama dilinden bilebileceğiniz printf fonksiyonu kullandık..
        //bunu kullanmamızın sebebi çıktıyı formatlamak için..Gekin aşağıda formatlamaya bakalım..
    
    }
    
    public String toString(){
    
    return String.format("%d/%d/%d", gün,ay,yıl);//Burası int değerleri string formatında gösterir herzaman...
    //Gördüğünüz gibi burada 3 tane integer değerini "%d" ile yazdırıyoruz ve printf fonksiyonunda this komutu ile gösteriyoruz..Şimdi toStringMain.java ya 
    //bakalım....
    }
}
