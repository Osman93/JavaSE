/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class StaticKullanımıMain {
    public static void main(String[] args) {
        //static kullanmazsak kişi sayısı değişmeyecektir... 
        System.out.println("Static Kullanmazsak...");
        StaticKullanımıClass nesne1=new StaticKullanımıClass("Ceren", "Fidan");
        StaticKullanımıClass nesne2=new StaticKullanımıClass("Nazlı", "Bilir");
        StaticKullanımıClass nesne3=new StaticKullanımıClass("Aykut", "Zengin");
        
        //ayrıca static metot yada değişkenleri class adıyla çağırabilirsiniz obje oluşturmanıza gerek yok..
        System.out.println(StaticKullanımıClass.sKişi);//gördüğünüz gibi sadece class ismi ile static değişkenimizi getirdim..
       
    }
}
