package piles;

public class Maillon {
    public int donnee;
    Maillon suivant;

    Maillon(int donnee, Maillon suivant) {
        this.donnee = donnee;
        this.suivant = suivant;
    }
}

