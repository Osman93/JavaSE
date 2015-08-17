/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class SwitchSeçimYapısı {
    public static void main(String[] arg){
    Scanner input=new Scanner(System.in);
    int işlem;
         double  sayi1,sayi2,sonuç=0;
    System.out.println("\t Switch Seçim Yapısı ile Basit Hesap Makinesi");
        System.out.print("Birinci sayiyi girin:");
        sayi1=input.nextInt();
        System.out.print("İkinci sayiyi girin:");
        sayi2=input.nextInt();
        System.out.println("\tİşlem Numarasını GiriN");
        System.out.println("Toplama=1\nÇıkarma=2\nÇarpma=3\nBölme=4");
        System.out.print("İşlem numarasını girin:");
        işlem=input.nextInt();
        
        switch(işlem){//Burada işlem değişkenini alıyor...ve
            case 1://işem==1 ise bu kısmı işletiyor..
                  sonuç = sayi1+sayi2;
                break;
            case 2://işem==2 ise bu kısmı işletiyor..
                sonuç = sayi1-sayi2;
                break;
            case 3://işem==3 ise bu kısmı işletiyor..
                sonuç = sayi1*sayi2;
                break;
            case 4://işem==4 ise bu kısmı işletiyor..
                if(sayi2!=0)
                sonuç = sayi1/sayi2;
                break;
            default://işlem değişkeninin değeri 1,2,3,4 dğilse bu kısım işleniyor..
                System.out.println("Böyle bir işlem tanımlı değil!!");
                break;
                
                
        }
        if(sayi2==0 && işlem==4)//Bu kısımda bir sayının 0 a bölündüğündeki hatayı almamak için yazdım...
            //Yani burda bölünen 0' eşit ve işlemimiz bölme olduğunda ekranan "Sonuç sonsuzdur yazdırıyoruz.."
            System.out.println("Sonuç sonsuzdur");
        else{
            System.out.println("Sonuç="+sonuç);
        }
    }
}
