package piles;

import java.util.ArrayList;

public class Empiler {

    private ArrayList<Integer>  pile = new ArrayList<Integer>();

    public Empiler() {

    }

    public void empiler(int n) {
        pile.add(n);
    }

    public int depiler() throws ExceptionPileVide {
        if(estVide()) {
            throw new ExceptionPileVide();
        } else {
            return pile.remove(pile.size() - 1);
        }
    }

    public boolean estVide() {
        return pile.size() == 0;
    }


}
