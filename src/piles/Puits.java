package piles;

import java.util.ArrayList;

public class Puits {
    public ArrayList<Integer> puit;
    public Integer taillePuit;

    public Puits(int taillePuit) {
        this.puit = new ArrayList<>();
        this.taillePuit = taillePuit;
    }

    public Boolean isEmpty() {
        return this.puit.size() == 0;
    }

    public void vider() throws ExceptionPuitVide {
        if(isEmpty()) {
            throw new ExceptionPuitVide();
        } else {
            this.puit.remove(this.puit.size()-1);
        }
    }

    public void remplir() throws PuitRempli {
        if (isFull()) {
            throw new PuitRempli();
        } else {
            this.puit.add(1);
        }
    }

    public Boolean isFull() {
        return this.puit.size() > this.taillePuit;
    }

    public String toString() {
        return "Le puit possede " + this.puit.size() + " seau d'eau";
    }
}
