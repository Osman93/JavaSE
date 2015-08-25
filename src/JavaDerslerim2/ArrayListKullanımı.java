/**
 * @author Osman Aşar
 */
package JavaDerslerim2;

import java.util.*;


public class ArrayListKullanımı {
    public static void main(String[] args) {
        String[] kelime1={"ahmet","mehmet","veli","abdullah"};
        String[] kelime2={"mehmet","veli"};
        List<String> list1 =new ArrayList<String>();//Burada ArrayList nesnemizi oluşturduk..
        List<String> list2=new ArrayList<String>();
        for(String x : kelime1){
        
      list1.add(x);//Burda ArrayList nesnemize kelime String dizisindeki elemanları içine attık..
        
        }
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");//Burda da ArrayList nesnemizdeki elemanları çağırdık..
        
        }
        for(String x: kelime2){
        list2.add(x);
        }
        editList(list1,list2);
        System.out.println();
         for(int i=0;i<list1.size();i++){//Bakalım list1 de olup list2 de olmayan elemanları mı gösterecek??
            System.out.print(list1.get(i)+" ");//Burda da ArrayList nesnemizdeki elemanları çağırdık..
       
        }
        
    }
    public static void editList(Collection<String> l1,Collection<String> l2){
    
    Iterator<String> it=l1.iterator();
    while(it.hasNext()){//l1 listesindeki tüm elemanlardan gececek..
    if(l2.contains(it.next())){//Eğer l2 listesi içindeki eleman iterator de dönen elemana eşit ise
    it.remove();//iterator silinecek o eleman kalkacak..
    
    }
    
    
    }
    
    
    }
}
