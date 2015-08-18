/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class OverloadedConstructorClass {
    private String ad;
    private String soyad;
    private int yaş;
    //Overloaded Constructor
    public OverloadedConstructorClass(){
   this(null,null,0);
    }
     public OverloadedConstructorClass(String a){
    this(a,null,0);
    
    }
      public OverloadedConstructorClass(String a,String s){
     this(a,s,0);
    
    }

 
    public OverloadedConstructorClass(String a,String s,int y){
     KurucuAyarla(a,s,y);
    
    }

    public void KurucuAyarla(String a, String s, int y) {
       
        //set ve get metotları
        setAd(a);
        setSoyad(s);
        setYaş(y);
    }
   public void setAd(String a){
   this.ad=a;
   }
   public void setSoyad(String s){
   this.soyad=s;
   }
   public void setYaş(int y){
   this.yaş=y;
   }
   public String getAd(){
   return this.ad;
   }
   public String getSoyad(){
   return this.soyad;
   }
   public int getYaş(){
   return this.yaş;
   }
   
   public String toString(){
   
   return String.format("İsim=%s\tSoyisim=%s\tYaş=%d",ad,soyad,yaş);
   }
   public void Yaz(){
   
       System.out.println(toString());
   }
    
}
