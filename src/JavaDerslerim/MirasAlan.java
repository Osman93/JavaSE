/**
 * @author Osman Aşar
 */
package JavaDerslerim;
public class MirasAlan extends MirasVeren {//extends ile inheritance(miras) sağlanır..
    public static void main(String[] args) {
        MirasAlan nesne=new MirasAlan();//Burdaki sınıfın nesnesini aldık.Yani MirasAlan'ın
        nesne.Miras();//MirasVeren'in metodunu kullanabiliyoruz..
    }
}
