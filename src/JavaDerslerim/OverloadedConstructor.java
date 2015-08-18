/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class OverloadedConstructor {
    public static void main(String[] args) {
        OverloadedConstructorClass obje1=new OverloadedConstructorClass();
        OverloadedConstructorClass obje2=new OverloadedConstructorClass("Ali");
        OverloadedConstructorClass obje3=new OverloadedConstructorClass("Mehmet","Oğuzoğlu");
        OverloadedConstructorClass obje4=new OverloadedConstructorClass("Osman","Aşar",21);
        
        
        obje1.Yaz();
        obje2.Yaz();
        obje3.Yaz();
        obje4.Yaz();
    }
}
