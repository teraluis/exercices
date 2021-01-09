package piles;

import java.util.ArrayList;

public class ExceptionPileVide extends Exception {

    public ExceptionPileVide() {
        super();
        System.out.println("Pile vide");
    }

    public String toString()
    {
        return "Pile vide";
    }
}
