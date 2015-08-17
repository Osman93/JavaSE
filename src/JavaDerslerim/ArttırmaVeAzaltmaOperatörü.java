/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class ArttırmaVeAzaltmaOperatörü {
    public static void main(String [] args){
    
    int sayi1,sayi2;//sayi1 ve sayi2 değişkenlerini İnteger olarak tanımladık..
    sayi1=5;//say1 değişkenine 5 değerini verdik..
    sayi2=10;//sayi2 değişkenine 10 değerini verdik....
    
    //İncrement(Arttırma) operatrü ne yapıyor bakalım...(++)
    System.out.println("\tArttırma Operatörü Kullanımı");
    System.out.println("Ön arttırma ile sayi1="+(++sayi1));//Gördüğünüz gibi ön arttırmayla sayi önce artıyor ve print() ile yazılıyor...
    sayi1=5;//sayi1 yukarda ++sayi1 ile 6 değeri olduğu için eski haline döndürdüm...
    System.out.println("Son arttırma ile sayi1="+(sayi1++));
//Gördüğünüz gibi yukarıda sayi1 aslında artıyor ancak print() fonksiyonu önce sayi1'i gördüğü için burda 5 yazıyor ve sonra artıyor..
    System.out.println("Son arttırmadan sonraki print() fonksiyonunda sayi1="+sayi1);
//Yukarıda gördüğünüz gibi sondan arttırma operatörünü kullanınca diğer prin() fonksiyonunda bu değişimi gördük...
    
    //Decrement(Azaltma) operatörü de arttırma ile aynı çalışıyor..Bunun içinde sayi2 değişkenini kullanalım...
    System.out.println("\tAzaltma Operatörü Kullanımı");
    System.out.println("Ön azaltma ile sayi2="+(--sayi2));
    sayi2=10;
    System.out.println("Son azaltma ile sayi2="+(sayi2--));
    System.out.println("Son azaltmadan sonraki print() fonksiyonunda sayi2="+sayi2);
    }
}
