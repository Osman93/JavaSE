/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class ÜçNoktaKullanımı {
    public static void main(String [] args){
        // 3 Nokta parametreli metot Kullanımı
        System.out.println(ortalama());//Hiç parametre almayabilir
        System.out.println(ortalama(1));//1 parametre alabilir
        System.out.println(ortalama(4,5));//2 parametre alabilir
        System.out.println(ortalama(6,7,8));//3 parametre alabilir
        System.out.println(ortalama(9,10,11,12));//4 parametre alabilir..
        //Hatta daha fazla parametre alabilir..
    
    }
    public static double ortalama(double ...sayi){
    double toplam=0;
    if(sayi.length==0){//3 Nokta parametreli değişken dizi gibi davranır
    return 0;
    }
    else{
    for(double x:sayi){//Özel for'u kullandık dizi gibi davrandığına kanıt
    toplam+=x;
    }
    return toplam/sayi.length;
    }
    }
}
