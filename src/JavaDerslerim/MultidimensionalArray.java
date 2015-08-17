/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class MultidimensionalArray {
    public static void main(String [] args){
    int[][]firstarray={{1,2,3},{5,9,10},{11,25,7}};
    int[][]secondarray={{9,2,3},{24},{11,17}};
        System.out.println("\tBirinci Çok Boyutlu Dizimiz");
        Göster(firstarray);
        System.out.println("\tİkinci Çok Boyutlu Dizimiz");
        Göster(secondarray);
    }
    public static void Göster(int x[][]){
    for(int satır=0;satır<x.length;satır++){
         for(int sütun=0;sütun<x[satır].length;sütun++){
             System.out.print(x[satır][sütun]+"\t");
         
         }
        System.out.println();
    }
    
    }
}
