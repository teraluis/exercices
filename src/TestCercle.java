import segment.Cercle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCercle {

    public static void main(String[] args) {
        ArrayList<Cercle> cercles = new ArrayList<Cercle>();

        Cercle c1 = new Cercle(3,4, 3);
        Cercle c2 = new Cercle(14,10, 5);
        Cercle c3 = new Cercle(2,7, 2);

        cercles.add(c1);
        cercles.add(c2);
        cercles.add(c3);
        System.out.println(cercles.toString());
        Collections.sort(cercles);
        System.out.println(cercles.toString());
/*        Collections.sort(cercles, new Comparator<Cercle>() {
            @Override
            public int compare(Cercle o1, Cercle o2) {
                if(o1.getRayon() <  o2.getRayon()) {
                    return -1;
                }else if(o1.getRayon() == o2.getRayon()) {
                    return 0;
                }else {
                    return 1;
                }
            }
        });*/
        System.out.println(cercles.toString());
    }
}
