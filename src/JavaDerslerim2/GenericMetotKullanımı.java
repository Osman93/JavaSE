/**
 * @author Osman Aşar
 */
package JavaDerslerim2;


public class GenericMetotKullanımı {
    public static void main(String[] args) {
        Integer[] iArray={1,2,3,4,5};
        Character[] cArray={'O','s','m','a','n'};
        
        printMe(iArray);
        printMe(cArray);
    }
/*    Generic metodu kullanmak için yorum satırına aldım bu bölümü
//printMe() adında oluşturduğumuz metodu overload olarak tanımlamalıyız generic metot kullanmazsak önce buna bakalım ..
    private static void printMe(Integer[] i){
    
    for(Integer x : i)
        System.out.printf("%s ", x);
        System.out.println();
    
    }
    private static void printMe(Character[] c){
    for(Character x : c)
        System.out.printf("%s ", x);
        System.out.println();
    
    }*/
    private static <T> void printMe(T[] t){
    //Gördüğünüz gibi sadece bu generic metodu kullanarak tüm veri tiplerini yazdırabiliriz bize programımızda kolaylık sağlar böylece
    for(T x : t)
        System.out.printf("%s ", x);
        System.out.println();
    
    }
}
