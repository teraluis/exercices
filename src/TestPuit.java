import piles.ExceptionPuitVide;
import piles.PuitRempli;
import piles.Puits;

public class TestPuit {
    public static void main(String[] args) throws ExceptionPuitVide, PuitRempli {
        Puits puit = new Puits(20);
        for(int i = 0; i < 15 ; i ++) {
            puit.remplir();
        };
        for(int i = 0; i < 10 ; i ++) {
            puit.vider();
        };
        System.out.println(puit.toString());
    }
}
