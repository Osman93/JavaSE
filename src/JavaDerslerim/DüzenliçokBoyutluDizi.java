/**
 * @author Osman Aşar
 */
package JavaDerslerim;


public class DüzenliçokBoyutluDizi {
    public static void main(String[]args){
    int[][]diziCok;//Çok boyutlu dizimizi tanımladık..
    diziCok=new int[2][2];//Çok boyutlu dizimizi tanımladık ancak bu düzenli çok boyutlu bir dizi
    diziCok[0][0]=5;//0.indeksteki dizimin elemanının 0.indeksindeki elemanına 5 değerini verdik..
    //Buna 1. satır 1.sutun olarak bakabilirsiniz..
    diziCok[0][1]=7;//1.satır 2.sutundaki elemana 7 değerini verdik..
    diziCok[1][0]=13;//2.satır 1.sutundaki elemana 13 değerini verdik
    diziCok[1][1]=56;//2.satır 2.sutundaki elemana 56 değerini verdik şimdi yazdıralım..
    int i,j;//for döngüsü için sayaçlar...
    for(i=0;i<diziCok.length;i++){//Burda elemanlar kaçıncı sırada yazdık hangi satır hangi sutunda belirtmek için..
        for( j=0;j<diziCok[0].length;j++){
        System.out.println((i+1)+".satır "+(j+1)+".sutun elemanı="+diziCok[i][j]);
        }     
    }
       System.out.print("Aslında Çok boyutlu diziler matrislerdir ve görünüşü aşağıdaki gibi");
    for(i=0;i<diziCok.length;i++){//Burda da matris şeklinde gösterelim çünkü Çok boyutlu diziler matris gibidir..
          System.out.println();
        for(j=0;j<diziCok[0].length;j++){
            System.out.print("\t"+diziCok[i][j]+"\t");
        
           }
        }
    System.out.println();
    }
}
