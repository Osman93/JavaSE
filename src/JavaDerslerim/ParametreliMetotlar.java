/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class ParametreliMetotlar {
    public void İsimYaz(String ad){//Değer döndürmeyen parametreli metot
    System.out.println("İsmim="+ad);
    }
    public String SoyisimYaz(String soyisim){//Değer döndüren parametreli metot
    return soyisim;
    }
    public static void main(String[]args){
        ParametreliMetotlar nesne=new ParametreliMetotlar();
        nesne.İsimYaz("Osman");
        System.out.println("Soyismim="+nesne.SoyisimYaz("Aşar"));
        //gördüğünüz gibi parametreleri işledik girdiğimiz parametreler çıktıda yer alıyor...
    }
    
}
