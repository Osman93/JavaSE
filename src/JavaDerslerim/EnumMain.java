/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class EnumMain {
    public static void main(String[] args) {
        for(EnumOluşturma kişi: EnumOluşturma.values()){
        System.out.printf("%s\t%s\t%d\n", kişi,kişi.getTanıtım(),kişi.getYıl());
        }
    }
}
