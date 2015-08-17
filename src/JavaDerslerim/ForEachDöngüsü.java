/**
 * @author Osman Aşar
 */

package JavaDerslerim;

public class ForEachDöngüsü {
    public static void main(String [] args){
    int[]dizi={1,2,3,4};//Dizi tanımladık ve değerleri direk verdik..
    int toplam=0;
    
    for(int x:dizi){//İşte bu özel for döngümüz
   // "x+=15;" ifadesini buraya koysaydık etkilenirdi çünkü dizi değerini aldıktan sonra arttırıyoruz..
        toplam+=x;
     x+=15;//Bunu bilerek koydum.Çünkü bu özel for döngüsünde x değişkeni değişiklikten etkilenmez..
    }
    System.out.println("Dizi elemanları toplamı="+toplam);
    toplam=0;//Kontrol yapmak için 0'a eşitledim..
    int aranan=2;
    for(int y:dizi){
    if(aranan==y){
    System.out.println("Aranan "+aranan+" değer bulundu");
    break;//For each döngüsü break ifadesi ile sonlanırUNUTMAYIN!!
    }
    toplam+=y;//aranan değer 2 dizimizde olduğu için if içine girecek ve döngüden çıkacaktır..
    }
    
    System.out.println("Break ile döngüden çıkıldığı için toplam 10 olması gerekirken, toplam="+toplam);//break döngüden çıkardığı için toplam=1 olacaktır.
    
    }
}
