/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public enum EnumRangeOluşturma {//yeni bir enum oluşturduk
    //Enum mumuzun elemanları parametreleri ile beraber..
   
    Tuğçe("güzel",12),
    Aslıhan("uzun",15),
    Sevgi("alımlı",16),
    Elif("kindar",17),
    Ceren("tiki",18),
    Gamze("anlayışlı",25);
    
    private final String tanıtım;
    private final int yıl;

     EnumRangeOluşturma(String t,int y) {
        this.tanıtım = t;
        this.yıl = y;
    }
    
    public String getTanıtım(){
    
    return tanıtım;
    }
    public int getYıl(){
    
    return yıl;
    }
    
    
}
