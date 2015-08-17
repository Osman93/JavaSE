/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class Döngüler {
    public static void main(String[] arg){
    int counter=1,toplam=0;
    //Döngüleri kullanarak 1'den 10'a kadar olan sayilarin toplamını bulalım...
    
    //While Döngüsünü kullanarak yapalım...
     System.out.println("\tWhile Döngüsü");
    while(counter<=10){
    toplam+=counter; 
    System.out.println(counter+".kez while döngüsü içindeyiz ve toplam şuan="+toplam);
    
    counter++;//Burada counter arttırdıkki koşulu yanlış yapsın ve sonsuz döngü olmasın
    }
    System.out.println("While Döngüsünden çıktık ve toplam="+toplam);
    
    counter=1;// 1'e eşitledik çünkü while döngüsünde bu değer 10 olmuştu..
    toplam=0;// 0' a eşitledik çünkü while döngüsünde bu değer 55 olmuştu..
    
    //do-while Döngüsünü kullanarak yapalım....
    System.out.println("\tdo-While Döngüsü");
    do{
    toplam+=counter; 
    System.out.println(counter+".kez while döngüsü içindeyiz ve toplam şuan="+toplam);
    
    counter++;//Burada counter arttırdıkki koşulu yanlış yapsın ve sonsuz döngü olmasın
    
    }while(counter<=10);
    System.out.println("do-While Döngüsünden çıktık ve toplam="+toplam);
    
   
    toplam=0;// 0' a eşitledik çünkü do-while döngüsünde bu değer 55 olmuştu..
    
    //For Döngüsünü kullanarak yapalım....
    System.out.println("\tfor Döngüsü");
    for(counter=1;counter<=10;counter++){
    toplam+=counter; 
    System.out.println(counter+".kez while döngüsü içindeyiz ve toplam şuan="+toplam);
    }
    System.out.println("for Döngüsünden çıktık ve toplam="+toplam);
    
    
    }
 
    
}
