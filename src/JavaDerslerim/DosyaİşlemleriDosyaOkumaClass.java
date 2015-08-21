/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.io.File;
import java.util.Scanner;


public class DosyaİşlemleriDosyaOkumaClass {
    private Scanner x;
    
    public void DosyaAç(){//var olan dosyamızı veriyoruz ki önce dosyanın varlığını tespit edelim
    
    try{
    x=new Scanner(new File("C:\\Users\\pc\\Documents\\NetBeansProjects\\JavaSE\\src\\JavaDerslerim\\java.txt"));
    
    }catch(Exception e){
    
    System.err.println("Dosya bulunamadı..");
    
    }
    
    
    }
    
    public void DosyaOku(){//Bu kısımda dosyadan veri  okuyacağız
    while(x.hasNext()){//x.hasNext() metodu boolean bir değerdir dosyanın sonuna geldiğinde birşey kalmamışsa 0 döndürür yani false ve döngü durur sona erer. 
    System.out.println(x.nextLine());
    
    
    }
    
    
    }
    public void DosyaKapat(){//Herzamanki gibi dosyayı kapatmayı unutmayın...
    
    x.close();
    }
    
}
