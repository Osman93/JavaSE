/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.EnumSet;
public class EnumRangeMain {
    
  
    public static void main(String[] args) {
     
        for(EnumRangeOluşturma kişi: EnumRangeOluşturma.values()){
        //önce tüm enum elemanlarımızı yazdıralım...
             System.out.printf("%s\t%s\t%d\n", kişi,kişi.getTanıtım(),kişi.getYıl());
        }
             System.out.println("\nŞimdi belli elemanlar arasında enum elemanlarımızı range ile yazdıralım\n");
        
             for(EnumRangeOluşturma kişi : EnumSet.range(EnumRangeOluşturma.Aslıhan, EnumRangeOluşturma.Ceren))
                 //Bu özel for döngüsü ile Aslıhan ve Ceren arasındaki elemanları alacaktır range bu işe yarar..
                 
           System.out.printf("%s\t%s\t%d\n", kişi,kişi.getTanıtım(),kişi.getYıl());
        
             
        
    }
}
