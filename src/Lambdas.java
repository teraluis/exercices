import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Lambdas {
    public static void main(String[] args) {
        int [] tab = {1, 4, - 2, -3, 4, 5};
        //affichage_selectif2(tab, a -> a % 2 == 0);

/*        Point [] tab = {new Point(2, 5), new Point(-3, 4), new Point(2, 3), new Point(6, -3)};
        Consumer<Integer> consumer = t -> System.out.println("Printing : " + t);
        ArrayList<Point> l = new ArrayList<Point>();
        for (Point p : tab) {
            l.add(p);
        }*/

        long nb = IntStream.of(tab).filter(x -> x > 0).count();
        System.out.println("nb " + nb);
        IntStream.of(tab).filter(x -> x>3).sorted().distinct()
                .forEach(x -> System.out.println(x));
    }

    public static void traiterListe(ArrayList<Point> liste, Predicate<Point> selec, Comparator<Point> comp, Consumer<Point> aff) {
        ArrayList<Point> liste2 = new ArrayList<Point>();
        liste.forEach( x -> {
            if(selec.test(x)) {
                liste2.add(x);
            }
        });
        liste2.sort(comp);
        liste2.forEach(x -> {aff.accept(x);});
    }
    public static void affichage_selectif(int [] t, Filtrage f) {
        for (int n : t) {
            if(f.filtre(n)) {
                System.out.println(n);
            }
        }
    }

    public static void affichage_selectif2(int [] t, IntPredicate f) {
        for (int n : t) {
            if(f.test(n)) {
                System.out.println(n);
            }
        }
    }
}

interface Filtrage {
    public Boolean filtre (int n);
}
