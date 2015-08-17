/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class ZamanSınıfıMain {
    public static void main(String [] args){
    ZamanSınıfı nesne=new ZamanSınıfı();
    
    nesne.zamanKur(13, 25, 3);
        System.out.println("\tAskeri Zaman");
        System.out.println(nesne.AskeriZaman());
        
        System.out.println("\tGündelik Zaman");
        System.out.println(nesne.GündelikZaman());
    
    }
}
