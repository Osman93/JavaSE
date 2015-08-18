/**
 * @author Osman Aşar
 */
package JavaDerslerim;


public enum EnumOluşturma {//Evet enum oluşturduk Enum adında...
    //
    Osman("hırslı",22),//Osman enum objesi ve içindekiler ise parametresidir..
    Çağatay("üşengeç",22),//Çağatay enum objesi ve içindekiler ise parametresidir..
    Tolga("bencil",25);//Tolg enum objesi ve içindekiler ise parametresidir..
    
    private final String tanıtım;//final bu değişkenin değişmeyeceği anlamına geliyor..Burası enum objesindeki ilk parametre için
    private final int yıl;//final bu değişkenin değişmeyeceği anlamına geliyor..Burası enum objesindeki ikinci parametre için
    
    EnumOluşturma(String t,int y){//Burada enum yapıcısı oluşturduk..
    tanıtım=t;
    yıl=y;
    
    }
    
    public String getTanıtım(){
    return tanıtım;
    }
    
    public int getYıl(){
    return yıl;
    }
}
