/**
 * @author Osman Aşar
 */
package JavaDerslerim2;


public class StringKütüphanesi {
    public static void main(String[] args) {
        String a="osmanaşarosmanaşar";
       
        System.out.println("\tindexOf Kullanımı");
          System.out.println(a.indexOf("an"));//burada "an" kelimesi kaçıncı indeksten başladığını belirtiyor
           System.out.println(a.indexOf('ş'));//burada 'ş' karakteri ilk nerde bulunuyor onu belirtiyor..
            System.out.println(a.indexOf("an", 4));//4.indexten sonrası için "an" kelimesini ilk bulduğu index'i getiriyor..
            
            System.out.println("\tconcat Kullanımı");
            String ad="Osman ";
            String soyad="Aşar";
            System.out.println(ad.concat(soyad));//görüldüğü gibi concat metodu string birleştirme işlemi yapar..
            System.out.println(ad+soyad);//Tıpkı overload olan toplama öperatörü gibi...
            
            System.out.println("\treplace Kullanımı");
            a="Android öğreniyorum Android"; 
            System.out.println(a.replaceAll("Android", "Java"));//gördüğünüz gibi replace metodu "Android" geçen her yeri Java ile değiştirmeye yarıyor
    
            System.out.println("\ttrim Kullanımı");
            a="        Merhaba              ";
            System.out.println(a.trim());//trim metodu ile sağdaki ve soldaki boşlukları kırpabiliriz..
            
            System.out.println("\ttoUpperCase ve toLowerCase Kullanımı");
            String b="JaVa";
            System.out.println(b.toUpperCase());//Bütün harfleri büyük yapar..
            System.out.println(b.toLowerCase());//Bütün harfleri küçük yapar..
             
    }
          
}
