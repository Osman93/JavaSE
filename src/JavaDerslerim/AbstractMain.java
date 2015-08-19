/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class AbstractMain extends AbstractClass {
    public static void main(String[] args) {
        AbstractMain nesne=new AbstractMain();
        
        nesne.Yaz();
    }
    
    
    public void Yaz(){//AbstractMain.java Abstract class dan miras alan olduğu için bu metot kullanılmazsa hataalırız
        System.out.println("Abstract Class içindeki abstract metot çalıştı..");
    }
}
