/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class Constructor2 {
    private String isim,soyisim;
    public Constructor2(String ad,String soyad){
    this.isim=ad;//Gördüğünüz gibi private isim değişkenine ilk değerlerini nesne üretildiğinde atacağız..
    this.soyisim=soyad;//Gördüğünüz gibi private soyisim değişkenine ilk değerlerini nesne üretildiğinde atacağız..
    }
    public void EkranaYaz(){//Atadığımız değerleri daha sonra bu metotla yazdıracağız.
    System.out.println(isim+" "+soyisim);
    }
    
}
