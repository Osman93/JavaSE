/**
 * @author Osman Aşar
 */
package JavaDerslerim2;

import java.util.*;
public class ListelerdeSortKullanımı {
    public static void main(String[] args) {
        String[] kelimeler={"Tolga","Şevke","Osman"};
        
        List<String> list=Arrays.asList(kelimeler);//list nesnemize kelimeler dizi string elemanlarını ekledik..
        
        Collections.sort(list);//Gördüğünüz üzere kelimeler dizi string deki elemanları alfabetik olarak sıraladık.
        System.out.printf("%s \n",list);
        Collections.sort(list,Collections.reverseOrder());//Nasıl sıralayacağımız sort() metodundaki 2.sıradaki parametre belirler.
        //Burada tersten alfabetik olarak sıralıyacağız..
        System.out.printf("%s \n", list);
    }
}
