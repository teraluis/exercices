package streams;

public interface Filtrage {

    public Boolean filtre(int n);

    public static void affichage_selectif( int [] t, Filtrage f) {
        for(int val : t) {
            if( f.filtre(val)) {
                System.out.println("val " + val);
            }
        }
    }
}
