/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class Merhaba {
    public static void main(String[] args) {
    /* '\t' ve '\n' nedir?? */
        //tırnak içindeki '\n' newLine demektir ve alt satıra geçirmemizi sağlar.
        //tırnak içindeki '\t' bir tab uzunluğunda boşluk yazmamızı sağlar 
        System.out.print("\t Merhaba JAVA \n");

    /*print() ile println() arasındaki fark?? */
        System.out.print("Benim adım ");
        System.out.println("Osman ");
        System.out.print("Soyadım ");
        System.out.println("Aşar");
        // print() ile aynı satırda yazma işlemi gerçekleştirken
        // println() ise alttaki satıra geçmemizi sağlar.   
    }
}