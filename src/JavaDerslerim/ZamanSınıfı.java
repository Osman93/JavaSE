/**
 * @author Osman Aşar
 */
package JavaDerslerim;

public class ZamanSınıfı {
    private int saat,dakika,saniye;
    public void zamanKur(int s,int d,int sc){
    saat=((s>=0 && s<24)? s : 0);//Burda yaptığım şey zamanı oluştururken saat 0-24 arasında değilse "0" olarak atayacaktır.. 
    dakika=((d>=0 && d<60)? d : 0);//Burda yaptığım şey zamanı oluştururken saat 0-24 arasında değilse "0" olarak atayacaktır.. 
    saniye=((sc>=0 && sc<24)? sc : 0);//Burda yaptığım şey zamanı oluştururken saat 0-24 arasında değilse "0" olarak atayacaktır.. 
    }
    public String AskeriZaman(){//String tipinde alıyoruz çünkü String.format ile biçimini değiştireceğiz..
        return String.format("%02d : %02d : %02d",saat,dakika,saniye);
    }
    public String GündelikZaman(){
    
    return String.format("%d : %02d : %02d  %s", ((saat>=0 && saat<=12)? saat : saat%12),dakika,saniye,((saat>=0 && saat<=12)? "AM" : "PM"));
    }
    
}
