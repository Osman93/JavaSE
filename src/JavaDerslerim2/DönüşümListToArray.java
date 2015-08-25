/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;

public class DönüşümListToArray {
    public static void main(String[] args) {
        String[] kelimeler={"Osman","Tolga","Ulaş"};
        LinkedList<String> list=new LinkedList<String>(Arrays.asList(kelimeler));
        //Yukarıda Arrays.asList(kelimeler) yazarak liste içine kelimeler dizi stringimizin elemanlarını attık.Arrayı tıpkı listeymiş gibi aldırdık..
        list.addFirst("Şevke");//İlk elemana ekleme yapar.
        list.add("Fatma");
        //kelimeler=list; şeklinde bir ifadeyle listemizdeki elemanları atayamayız önce dönüştürmemiz lazım..
        kelimeler=list.toArray(new String[list.size()]);//bu şekilde list nesnemiz array formatına almış olduk
        for(String x : kelimeler)
            System.out.printf("%s ", x);
            
    }
}
