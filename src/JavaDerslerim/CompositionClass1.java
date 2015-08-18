/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class CompositionClass1 {
    private String ad;
    private CompositionClass2 doğumGünü;//Gördüğünüz gibi diğer bir class'dan objeyi alıp kullanabiliyoruz..
    
    public CompositionClass1(String a,CompositionClass2 d){
    
    ad=a;
    doğumGünü=d;
   yaz();
    
    }
    @Override
    public String toString(){
    
    return String.format("Adım=%s\nDoğum günüm=%s", ad,doğumGünü);
    }
    public void yaz(){
    
        System.out.println(this.toString());
    
    }
}
