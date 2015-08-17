/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class tekBoyutluDizi {
    public static void main(String[]args){
    int []diziInt;//ınteger dizi Tanımlamasını yaptık..
    String []diziString={"Index","Eleman","Değer"};//String dizi tanımlamasını 2.yoldan yaptık.
    diziInt=new int[3];//Kaç eleman alacağını belirttik.
    diziInt[0]=12;//0.indekse yani ilk elemana değer ataması yaptık..
    diziInt[1]=5;//1.indekse yani ilkinci elemana değer ataması yaptık..
    diziInt[2]=89;//2.indekse yani üçüncü elemana değer ataması yaptık..
    for(int j=0;j<diziString.length;j++){//diziString.length() fonksiyonu dizinin uzunluğunu verir.
    System.out.print(diziString[j]+"\t");//String dizimizi başlık için yazdırıyoruz..
    }
    System.out.println();
    for(int i=0;i<diziInt.length;i++){
    System.out.println(i+"\t"+(i+1)+"\t"+diziInt[i]);
    }
    
    }
}
