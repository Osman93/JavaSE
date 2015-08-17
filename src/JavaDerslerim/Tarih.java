/**
 * @author Osman Aşar
 */
package JavaDerslerim;

import java.util.Calendar;
import java.util.Formatter;

public class Tarih {
    public static void main(String [] args){
 Formatter fmt = new Formatter();
 Calendar cal = Calendar.getInstance();
 // Standart 12 saat zaman biçeminde yaz.
 fmt.format("%tr", cal);//Bu biçimleme şuanki saati 12 lik "AM" , "PM" ile yazar
 System.out.println(fmt);
 // Tarih ve zamanı tam biçemiyle yaz.
 fmt = new Formatter();
 fmt.format("%tc", cal);
 System.out.println(fmt);
 // Yalnız saat ve dakikayı g
 fmt=new Formatter();
 fmt.format("%tl:%tM", cal, cal);
 System.out.println(fmt);
 // Ay adını ve sırasını göster.
 fmt = new Formatter();
 fmt.format("%tB %tb %tm", cal, cal, cal);
 System.out.println(fmt); 
    }
}
