/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;

public class addAllKullanımı {
    public static void main(String[] args) {
        String [] kelimeler={"Osman","Tolga","Fatma"};
        List<String> list1=Arrays.asList(kelimeler);
        ArrayList<String> list2=new ArrayList<String>();
        
       // list2.addAll(list1); bunun yerine addAll() metodunu şu şekilde kullanabiliriz
        
        Collections.addAll(list2, kelimeler);
        
        for(String x : list2){
        System.out.print(x+" ");
        
        }
    }
}
