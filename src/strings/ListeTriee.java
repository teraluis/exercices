package strings;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListeTriee {
    public LinkedList<String> liste; // ou ArrayList
    public ListeTriee() {
        this.liste = new LinkedList<String>();

    }

    public void ajoute (String ch) {
        ListIterator <String> it =  liste.listIterator();
        boolean trouve = false;
        while(it.hasNext() && !trouve) {
            if(it.next().compareTo(ch) > 0) {
                trouve = true;
            }
        }
        if(trouve) {
            it.previous();
        }
        it.add(ch);
    }

    public void affiche () {
        for(String ch : this.liste) {
            System.out.println(ch);
        }
    }
}
