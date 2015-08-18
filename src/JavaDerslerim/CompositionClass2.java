/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class CompositionClass2 {
    private int gün,ay,yıl;
    
    public CompositionClass2(int g,int a,int y){
    
    gün=g;
    ay=a;
    yıl=y;
    
   
    
    }
    @Override
   public String toString(){
   
   return String.format("%02d/%02d/%02d", gün,ay,yıl);// %02d yazarak eğer iki haneli değilse tek haneliyse önünde 0 yazacak demek...
   }
}
