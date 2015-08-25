/**
 * @author Osman Aşar
 */
package JavaDerslerim2;

import java.util.*;


public class QueueKullanımı {
    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<String>();
        
        q.offer("a");//Queue'e bilgi eklemek offer() metodu ile gerçekleşir..
        printQueue(q);
         q.offer("b");
        printQueue(q);
         q.offer("c");
        printQueue(q);

        q.poll();//Queue'den ilk giren elemanı çıkarır.
         printQueue(q);
         q.poll();//Queue'den ikinci giren elemanı çıkarır.
         printQueue(q);
         q.poll();//Queue'den üçüncü giren elemanı çıkarır.
         printQueue(q);
    }
    private static void printQueue(PriorityQueue<String> a){
    if(a.isEmpty())//isEmpty() metodu queue boş ise true dolu ise false döndürür.
            System.out.println("Queue'niz boş");
    else
        System.out.printf("TOP %s \n", a);
    
    }
}
