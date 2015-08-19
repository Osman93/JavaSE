/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class PolymorhismMain {
    public static void main(String[] args) {
        PolymorphismClass3 nesne[]=new PolymorphismClass3[3];//Burada 3 tane nesne yaratmak için dizi kullandık..
        nesne[0]=new PolymorphismClass1();//PolymorphismClass1 'den nesne oluşturduk..
        nesne[1]=new PolymorphismClass2();//PolymorphismClass2 'den nesne oluşturduk..
        nesne[2]=new PolymorphismClass3();//PolymorphismClass3 'den nesne oluşturduk..
        
        for(int i=0;i<nesne.length;i++){
        
            nesne[i].Yaz();//Gördüğünüz gibi aynı yaz() metotları çok biçimlilik sayesinde her class nesnesi ile değişmiş oldu.
        }
        PolymorphismClass4 obje4=new PolymorphismClass4();
        PolymorphismClass3 obje3=new PolymorphismClass1();//Gördüğünüz gibi PolymorphismClass3 nesnesi kullanırken PolymorphismClass1 deki Yaz() polymorpik nesneyi getirtiyoruz.
        PolymorphismClass3 obje2=new PolymorphismClass2();//Gördüğünüz gibi PolymorphismClass3 nesnesi kullanırken PolymorphismClass2 deki Yaz() polymorpik nesneyi getirtiyoruz.
        System.out.println();
        obje4.Yaz(obje3);
        obje4.Yaz(obje2);
    }
}
