/**
 * @author Osman Aşar
 */
package JavaDerslerim2;


public class GenericMetotDönüşTipiKullanımı {
    public static void main(String[] args) {
        System.out.println("3 İnteger sayının en büyüğü="+max(11,9,78));
        System.out.println("3 String değerinin alfabetik olarak en büyüğü="+max("Osman","Tolga","Şevke"));
    }
    private static <T extends Comparable<T>>T max(T a,T b,T c){//Burada generic metodumuz Comparable sınıfından miras alacağını belirttik T ise dönüş tipidir..
        T büyük=a;
        
        if(b.compareTo(a)>0)
            büyük=b;
        if(c.compareTo(büyük)>0)
            büyük=c;
    return büyük;
    
    
    }
}
