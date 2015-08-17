/**
 * @author Osman Aşar
 */
package JavaDerslerim;//import netbeans de package den önce yazmayın hata veriyor...
import java.util.Random;
import java.util.Scanner;
public class RandomSayıÜretme {
    public static void main(String[] args){
    Random rand=new Random();
    int sayi1,sayi2;
    
    sayi1=rand.nextInt(100)+1;//1 den 100 e kadar olan sayıları ürettik..
    sayi2=rand.nextInt(100)+101;//burda da 101 den 200 e kadar olan sayilari ürettik..
    System.out.println("1-100 arası ürettilen random sayi="+sayi1);
    System.out.println("101-200 arası ürettilen random sayi="+sayi2);
    }
}
  /*Bilgisayar jimlastiği

    Random rand=new Random();
    Scanner input=new Scanner(System.in);
    int count1=0,count2=0;
    int sayi1,sayi2,bizimSayi;
    System.out.println("Bilgisayar İki adet kendi hafizasından sayi üretiyor ve bizim girdiğimiz değeri ilk hang sayi üretecek ve kaç adımda üretecek");
    System.out.println("Bilgisayarın bulacağı sayiyi girin:(0 ile 100 arasında bir sayi girin)");
    bizimSayi=input.nextInt();
    sayi1=rand.nextInt(100);//bu halde 0 ile 99 arasında üretir rastgele bir şekilde üretir...
    sayi2=rand.nextInt(100)+1;//bu durumda 1 ile 100 arasında rastgele sayi üretir...
    while(bizimSayi!=sayi1 ){
    sayi1=rand.nextInt(100);
    count1++;
    }
    while(bizimSayi!=sayi2 ){
    sayi2=rand.nextInt(100);
    count2++;
    }
  int sum;
  sum=count1-count2;
  System.out.println("Sayi1 değişkeni sizin sayinizi "+count1+". seferde buldu");
  System.out.println("Sayi1 değişkeni sizin sayinizi "+count2+". seferde buldu");
 if(sum<0){
     System.out.println("Sayi1 erken buldu KAZANAN Sayi1");
 }
 else if(sum>0){
     System.out.println("Sayi2 erken buldu KAZANAN Sayi2");
 }
 else{
     System.out.println("Eşitlik var");
 }
   */