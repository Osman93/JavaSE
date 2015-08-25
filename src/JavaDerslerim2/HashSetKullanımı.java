/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;

public class HashSetKullanımı {
    public static void main(String[] args) {
        String[] kelimeler={"Osman","Tolga","Şevke","Osman","Fatma","Tolga","Şevke","Fatma"};
        List<String>list=Arrays.asList(kelimeler);
        
        System.out.printf("%s ",list);
        System.out.println();
        
        Set<String> set=new HashSet<String>(list);
        System.out.printf("%s ",set);//Gördüğünüz gibi HashSet tekrarlı elemanlı listelerdeki elemanı sadece 1 kez kullanmak istiyorsak kullanırız..
    }
}
