/**
 * @author Osman Aşar
 */
package JavaDerslerim;
import java.util.Scanner;
public class NestedİfSeçimYapısı {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    String kulAdi = null,parola = null;
    String user="Osman",password="osmn+aşr!";
    int counter=3;
    while(counter>=0){
        System.out.print("Kullanıcı adınızı girin:");
        kulAdi=input.nextLine();
        if(kulAdi.equals(user)){
        System.out.print("Şifrenizi girin:");
        parola=input.nextLine();
                     if(parola.compareToIgnoreCase(password)==0){
                     
                         System.out.println("Giriş yapıldı.. ");
                         counter=0;
                     }
                     else{
                     System.out.println("Şifreniz yanlış.. ");
                     }
        }
        else{
        System.out.println("Kullanıcı adı yanlış ");
        }
        System.out.println(counter+" hakkınız kaldı..");
        if(counter==1)
            System.out.println("Kartınızın bloke olmaması için daha dikkatli girin son hakkınız..");
        counter--;
    
    
    }
    if(!(kulAdi.equals(user)&&parola.equals(password))){
    System.out.println("Kartınız bloke oldu..");
    }
    
    }
}
