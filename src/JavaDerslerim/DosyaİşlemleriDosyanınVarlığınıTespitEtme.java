/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.io.File;//Dosya işlemleri için bunu import etmemiz lazım..


public class DosyaİşlemleriDosyanınVarlığınıTespitEtme {
    public static void main(String[] args) {
        //Burada dosyanın var olup olmadığını kontrol etmeyi öğreneceğiz..
        File file=new File("C:\\Users\\pc\\Documents\\NetBeansProjects\\JavaSE\\src\\JavaDerslerim\\osman.txt");
        
        if(file.exists())
            System.out.println(file.getName()+" dosyası verdiğiniz yolda bulunuyor");
        else
            System.out.println(file.getName()+" dosyası verdiğiniz yolda bulunmuyor");
    }
}
