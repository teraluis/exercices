import java.util.StringTokenizer;

public class Tronque {
    static String tronque(String chaine, int nbDecimales) {
        String avant;
        String apres;

        StringTokenizer st = new StringTokenizer(chaine, ".");
        avant = st.nextToken();
        if(st.hasMoreTokens()) apres = st.nextToken();
        else return avant;

        if(apres.length() <= nbDecimales) {
            return chaine;
        }
        return chaine.substring(0, chaine.length() - apres.length() + nbDecimales);
    }
}
