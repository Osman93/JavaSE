/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;

public class StackKullanımı {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();//Önce Stack'imizi tanımladık
        stack.push("a");//Stack'te push metodu bilgi ekler en tepeye eklenir herzaman push() metodu ile
        printStack(stack);
        stack.push("b");
        printStack(stack);
        stack.push("c");
      printStack(stack);
        
        stack.pop();//Stack'te pop metodu bilgiyi çıkarır en tepeden çıkarır
        printStack(stack);
        stack.pop();
       printStack(stack);
        stack.pop();
      printStack(stack);
      //Stack'teki mantık last in first out dur...
      
    }
    private static void printStack(Stack<String> s){
       if(s.isEmpty())//Stack'in boş olup olmaması isEmpty()metodu ile bulunabilir eğer boşşa true doluysa false döndürür..
            System.out.println("Stack'iniz boş");
       else
           System.out.printf("%s TOP\n", s);
    
    }
}
