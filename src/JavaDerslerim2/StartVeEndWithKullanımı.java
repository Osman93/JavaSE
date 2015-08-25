/**
 * @author Osman Aşar
 */
package JavaDerslerim2;


public class StartVeEndWithKullanımı {
    public static void main(String[] args) {
        String [] kelimeler={"osman","ali","osi","aslı","mehmet","meliha","tolga","şevke","olga"};
        //Burada String dizisi oluşturmuş olduk...
        //startsWith Kullanımı
        for(String k : kelimeler ){//Burada özel for yapısını String dizisinden eleman almak için kullandık..
            
            if(k.startsWith("os")){//startsWith metodu boolean döndürür Burada "os" ile başlayan kelime bulunca yakalayacaktır ve true döndürecektir bulamazsa false
            
                System.out.println(k +" kelimesi os ile başlıyor..");//Ardından bulunan kelimeleri yazıyoruz...
            }
        
        
        }
        //endsWith Kullanımı
        for(String k: kelimeler){
        
           if(k.endsWith("ga")){//Sonu "ga" ile biten kelimeler bulunduğunda true diğer türlü false döndürür..
           
               System.out.println(k+" kelimesi ga ile bitiyor");
           
           
           }
        
        
        }
        
    }
}
