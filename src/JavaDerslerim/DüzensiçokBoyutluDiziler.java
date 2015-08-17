/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class DüzensiçokBoyutluDiziler {
    public static void main(String[] args){
    int[][]düzensizDizi;//Düzensiz çok boyutlu dizimizi tanımladık..
    düzensizDizi=new int[3][];
    int i,j;
     int sayac=0;  
    düzensizDizi[0]=new int[3];//1.satırdaki elemanın 3 sutuna sahip olcağını söyledik..
    düzensizDizi[1]=new int[2];//2.satırdakinin  2 sutuna sahip olacağını dedik..
    düzensizDizi[2]=new int[2];//3.satırdaki elemanın 2 sutuna sahip olacağını söyledik..
    düzensizDizi[0][0]=1;//1.satır 1.sütun elemanına 1 değerini verdik
    düzensizDizi[0][1]=5;//1.satır 2.sütun elemanına 5 değerini verdik
    düzensizDizi[0][2]=7;//1.satır 3.sütun elemanına 7 değerini verdik
    
    düzensizDizi[1][0]=12;//2.satır 1.sutun elemanına 12 değerini verdik
    düzensizDizi[1][1]=13;//2.satır 2.sutun elemanına 13 değerini verdik
    düzensizDizi[2][0]=56;//3.satır 1.sutun elemanına 56 değerini verdik.
    düzensizDizi[2][1]=97;//3.satır 2.sutun elemanına 97 değerini verdik.
    for(i=1;i<düzensizDizi.length;i++){
         if(sayac==0){//sayac koydum çünkü 1.satırdaki değerleri 1 kez getirmeliyiz
          sayac++;
                for(j=0;j<düzensizDizi[0].length;j++){
                     System.out.print("1.satır "+(j+1)+".sütün elemanı="+düzensizDizi[0][j]);//Burda düzensiz olduğu için for'dan bağımsız çalışmalı 
                      System.out.println();
                }
         }
                       for(j=0;j<düzensizDizi[1].length;j++){
                             System.out.print((i+1)+".satır "+(j+1)+".sütün elemanı="+düzensizDizi[i][j]);
                             System.out.println();
                        }
    
   
    }
    sayac=0;
   System.out.print("Aslında Çok boyutlu düzensiz diziler matrislerdir ve görünüşü aşağıdaki gibi düzensizdir");
    for(i=1;i<düzensizDizi.length;i++){//Burda da matris şeklinde gösterelim çünkü Çok boyutlu diziler matris gibidir..
          System.out.println();
          if(sayac==0){//Yine sayaç koydum çünkü i'ye göre çalıştırmıyoruz..
                 for(j=0;j<düzensizDizi[0].length;j++){//Burda düzensiz olduğu için for'dan bağımsız çalışmalı 
                     System.out.print("\t"+düzensizDizi[0][j]+"\t");
                     sayac++;
                } 
          System.out.println();
          }
        for(j=0;j<düzensizDizi[1].length;j++){
            System.out.print("\t"+düzensizDizi[i][j]+"\t");
        
        }
    }
    
    System.out.println();
    }
}
