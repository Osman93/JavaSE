/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.util.Formatter;


public class DosyaİşlemleriDosyayaYazmaClass {
    
    private Formatter newFile;//Önce dosyamızı oluşturalım ardından yazalım..
    
    public void DosyaYarat(){//Bu metotla dosya yaratmış olduk...
    
    try{
    newFile=new Formatter("C:\\Users\\pc\\Documents\\NetBeansProjects\\JavaSE\\src\\JavaDerslerim\\java.txt");
    
    }catch(Exception e){
    
    System.err.println("Hata oluştu..");
    }
    
    }
    public void DosyaYaYaz(){//Burada dosyaya yazı yazdık...
    newFile.format("%s %s\n","Java","Öğreniyorum");
    
    }
    public void DosyaKapat(){//Her açılan dosyayı kapatmayı unutmayın
    newFile.close();
    
    }
    
    
    
    
}
