package collections;

import java.util.LinkedList;

public class Collections {
    public Collections() {
        LinkedList<Integer> liste = new LinkedList<Integer>();
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(12);
        System.out.println(liste);
        liste.remove(3);
        System.out.println(liste);
    }
}
