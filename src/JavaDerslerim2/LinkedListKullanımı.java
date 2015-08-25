/**
 * @author Osman Aşar
 */
package JavaDerslerim2;
import java.util.*;

public class LinkedListKullanımı {
    public static void main(String[] args) {
        String[] kelime1={"osman","tolga","şevke","fatma"};
        String[] kelime2={"ulaş","kemal","osmAn"};
        
        List<String> list1=new LinkedList<String>();//Linked list oluşturduk burada..
        
        for(String x : kelime1){
        
        list1.add(x);//LinkedList nesnemize kelime1 string dizimizdeki elemanları eklemek için add() metodunu kullandık.
        }
           List<String> list2=new LinkedList<String>();//2. LinkedList elemanını oluşturduk..
             for(String y : kelime2){//Bu kısımda list2 ye kelime2 string dizimizi ekleyeceğiz..
        
             list2.add(y);
        
             }
       list1.addAll(list2);//Burada LinkedList elemanlarının hepsini eklemek için addAll() metodunu kullandık.
             printMe(list1); //list1 elemanlarını yazdırmak için kendi metodumuzu oluşturuyoruz..
             removeMe(list1,2,5);//2 ile 5. elemanlarını LinkedList nesnemizden silmek için kendi metodumuzu oluşturduk..
             printMe(list1);
             printReverse(list1);//LinkedList elemanlarını tersten yazdırmak için kendi metodumuzu oluşturduk..
             
    }
    private static void printMe(List<String> l){
    
    for(String b : l){
    System.out.printf("%s ", b);
        
    }
    System.out.println();
    }
    
    private static void removeMe(List<String> l,int b,int s){
    l.subList(b, s+1).clear();//Burada LinkedList nesnemizin alt kümesini getirdik subList() metodu ile ve ardından clear() metodu ile sildik..
    }
    private static void printReverse(List<String> l){
    ListIterator<String> lIt=l.listIterator(l.size());//ListIterator de içine değer vermezseniz liste uzunluğu yani çalışmaz..
    while(lIt.hasPrevious()){//lIt.hasPrevious() metodunu kullandık ki sondan yazdırabilelim..oyuzden hasNext()'i kullanmadık..
    
    System.out.printf("%s ", lIt.previous());//hasPrevious() metodu kullandığımız için elemanı çağırma işleminde next() yerine previous() kullanmalıyız yoksa hata alırız..
    }
    }
}
