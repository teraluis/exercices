package piles;

public class ExceptionPuitVide extends Exception {
    public ExceptionPuitVide() {
        super();
        System.out.println("Le puit est déjà vide vous ne pouvez plus retirer de l'eau");
    }
}
