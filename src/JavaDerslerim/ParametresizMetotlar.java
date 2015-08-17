/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class ParametresizMetotlar {
    String isim,soyisim;
    public void BilgiGiriş(){//Değer döndürmeyen metotlara örnektir ve parametresizdir
        Scanner input=new Scanner(System.in); 
        System.out.print("İsminizi girin:");
        isim=input.nextLine();
        System.out.print("Soyisminizi girin:");
        soyisim=input.nextLine();
        //Gördüğünüz gibi değer döndürmeyen metotlarda return ifadesi yoktur
        
    }
    public String İsimGetir(){//Değer döndüren metotlara örnek ancak gene parametresiz
    return this.isim;//this anahtar kelimesi global değişkenimiz olan isim 'i getirmek için kullandık..
    //gördüğünüz gibi değer döndüren metotlarda return ifadesi olmadan olmaz
    }
    public String SoyisimGetir(){//Değer döndüren metotlara örnek ancak parametresiz..
    return this.soyisim; //this anahtar kelimesi global değişkenimiz olan soyisim 'i getirmek için kullandık..
    //gördüğünüz gibi değer döndüren metotlarda return ifadesi olmadan olmaz
    }
    public static void main(String[]args){
    ParametresizMetotlar nesne=new ParametresizMetotlar();
    nesne.BilgiGiriş();
        System.out.println("İsminiz="+nesne.İsimGetir());
        System.out.println("Soyisminiz="+nesne.İsimGetir());    
    }  
}
