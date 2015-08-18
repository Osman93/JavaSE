/**
 * @author Osman Aşar
 */
package JavaDerslerim;


public class CompositionMain {
    public static void main(String[] args) {
        CompositionClass2 class2=new CompositionClass2(5, 3,1993);
        CompositionClass1 class1 = new CompositionClass1("Osman", class2);
        
    }
}
