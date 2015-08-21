/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class StringFunctions {
public static void main(String[] args){
	String metin="Merhaba Osman";
	//charAt fonksiyonuna bakalım..
	System.out.println(metin.charAt(0));//Görüldüğü gibi metnin ilk karakterini getirdi..
	System.out.println(metin.charAt(metin.length()-1));//Görüldüğü gibi metnin son karakterini getirdi.
	
	//compareTo fonksiyonuna bakalım.
	String metin1="A";
	String metin2="C";
	System.out.println(metin1.compareTo(metin2));//burada sonucu -2 gösteriyor bu A harfi C'den 2harf önde demek..
	
	/*kısaca compareTo fonksiyonu
	alfabetik olarak
	metin1<metin2 ise negatif
	metin1>metin2 ise pozitif
	metin1=metin2 ise 0'dır...     */

    //compareToIgnoreCase fonksiyonuna bakalım.
	metin1="A";
    metin2="a";
    System.out.println(metin1.compareToIgnoreCase(metin2));//Gördüğümün gibi burada 0 sonucunu veriyor Çünkü case sensetive kalktı bu fonksiyonla
    
    //concat fonksiyonuna bakalım..
    metin1="Ja";
    metin2="Va";
    System.out.println(metin1.concat(metin2));//Gördüğümüz gibi iki stringi birleştirmek için kullanıyoruz..
    
    //indexOf fonksiyonuna bakalım.
    metin1="Merhaba Java Öğreniyorum";
    int boşlukNerede;
    boşlukNerede=metin1.indexOf(" ");
    System.out.print(metin1.charAt(0));
    System.out.print(metin1.charAt(boşlukNerede+1));
    boşlukNerede=metin1.indexOf(" ", boşlukNerede+1);
    System.out.println(metin1.charAt(boşlukNerede+1));
	/*Aslında indexOf fonksiyonu içindeki ilk karakteri bulur ve getirir ancak biz burada kısaltmak için boşlukları buldurduk..
	 lastIndexOf fonksiyonu ise içindeki karakterin en son nerde bulunduğunu belirtir bize..*/
    
    //replaceAll fonksiyonuna bakalım şimdi..
    
    metin1="java cok güzel bir dil ah java vah java";
    System.out.println(metin1.replaceAll("java", "Android"));//gördüğümüz gibi java olan tüm yerler Android olarak yerdeğiştirmiştir..
    
    //substring fonksiyonuna bakalım..
    
    metin1="Merhaba Java Öğreniyorum";
    System.out.println(metin1.substring(13));//gördüğümüz gibi 13. indeksten metnin tamamına kadarını bu şekilde almış olduk..
    System.out.println(metin1.substring(13, 16));//buda 13 ile 16 arasındakikarakterleri alır..
    
    //toLowerCase ve toUpperCase fonksiyonlarına bakalım...
    metin1="AbCdEfGh";
    
    System.out.println(metin1.toLowerCase());//gördüğünüz gibi metnin tüm karakterlerini küçük harf yaptı.
    System.out.println(metin1.toUpperCase());//gördüğünüz gibi metnin tüm karakterlerini büyük harf yaptı.
    
    //trim fonksiyonuna bakalım..
    metin1="           Merhaba Java Öğreniyorum           ";
    System.out.println(metin1);
    System.out.println(metin1.trim());//gördüğünüz gibi bu fonksiyon metnin sağ ve solundaki boşluklarını görmezden gelir.
    
    
}

}
