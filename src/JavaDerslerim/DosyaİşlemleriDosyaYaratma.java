/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.util.Formatter;//Formatter Class'ını kullanmak için import etmemiz lazım..
import java.io.*;

public class DosyaİşlemleriDosyaYaratma {
    public static void main(String[] args) {
        //bu programda dosya yaratmasını öğreneceğiz..
        final Formatter newFile;
        try{//try catch bloğunda bu işlemi yapmamın amacı herhangi bir oluşturma hatası olduğunda hatayı yakalayabilmektir.
            newFile=new Formatter("java.txt");
            System.out.println("java.txt dosyanız oluşturuldu..");
   
        }catch(Exception e){
        System.err.println("Bir hata oluştu...");
        
        }
        
    }
}
