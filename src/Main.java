import segment.Segment;
import probas.Probas;
import strings.Voyelles;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import static probas.Probas.somme;


public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> liste = new LinkedList<Integer>();
        LinkedList<Integer> liste2 = new LinkedList<>();
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(12);
        System.out.println(liste);
/*        liste.remove(new Integer(3));
        System.out.println(liste);*/
        Iterator <Integer> it = liste.iterator();
        while (it.hasNext()) if (it.next() == 3) it.remove();
        System.out.println(liste);

    }
}


