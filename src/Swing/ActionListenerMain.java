/**
 * @author Osman Aşar
 */
package Swing;
import javax.swing.JFrame;//ActionListenerClass daki JFrame i kullanmak için import etmeliyiz..
public class ActionListenerMain {
    public static void main(String[] args) {
        ActionListenerClass frame=new ActionListenerClass();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Kapat düğmesine bastığımızda frame kapanacak..
        frame.setSize(300, 100);//Frame boyutlarını girdik..
        frame.setResizable(false);//Bu  şekilde frame mizin boyutu hiçbir şekilde değiştirilemeyecek..
        frame.setVisible(true);//Frame mimizi görmek için görünür yaptık...
    
}


}
