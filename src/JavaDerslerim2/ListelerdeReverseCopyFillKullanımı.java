/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;


public class ListelerdeReverseCopyFillKullanımı {
    public static void main(String[] args) {
        Character[] ray={'n','w','p'};
    List<Character> list=Arrays.asList(ray);
    
        System.out.print("Listemiz=");
        output(list);
        
        Collections.reverse(list);
        System.out.print("Reverse edilen listemiz=");
        output(list);
        
        Character[] newRay=new Character[3];
        List<Character> listCopy=Arrays.asList(newRay);
        Collections.copy(listCopy, list);
        System.out.print("ilk listemizden copy edilen listemiz=");
        output(list);
        
        Collections.fill(list, 'X');
         System.out.print("X ile doldurulmuş Listemiz=");
        output(list);
    
    }
    private static void output(List<Character> l){
    
    System.out.printf("%s \n", l);
    }
    
    
}
