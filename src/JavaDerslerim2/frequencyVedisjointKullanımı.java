/**
 * @author Osman Aşar
 */
package JavaDerslerim2;

import java.util.*;
public class frequencyVedisjointKullanımı {
    public static void main(String[] args) {
        String[] kelimeler={"Osman","Tolga","Şevke"};
        List<String> list1=Arrays.asList(kelimeler);
        
        ArrayList<String> list2=new ArrayList<String>();
        list2.addAll(list1);
        list2.add("Osman");
        list2.add("Kemal");
    
        
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("Berrak");


//frequency kullanımı ve anlamı
        System.out.println("\tFrequency Kullanımı");
        System.out.println("list2 nesnemizin içinde kaç tane Osman kelimesi var="+Collections.frequency(list2, "Osman"));
   //Gördüğünüz gibi listedeki elemanın kaç tane olduğunu bize verir frequency() metodu
        
        
 //disjoint kullanımı ve anlamı
        System.out.println("\tDisjoint Kullanımı");
        if(Collections.disjoint(list1, list2))
            System.out.println("list1 ve list2 de hiç ortak eleman yoktur.");
        else
            System.out.println("list1 ve list2 de ortak eleman vardır.");
        
        
        if(Collections.disjoint(list1, list3))
            System.out.println("list1 ve list3 de hiç ortak eleman yoktur.");
        else
            System.out.println("list1 ve list3 de ortak eleman vardır.");
        
        //görüldüğü üzere disjoint() metodu boolean değer döndürür ve listelerde ortak eleman varsa false ortak eleman yoksa true döndürür..
    }
}
