import java.text.DecimalFormat;
import java.util.*;

public class Tableaux {
    public static void main(String args[]) {
        //isocele(8);
        //combinations();
        conjugaison("programmer");
    }

    static float harmonique(int n) {
        float somme = 0;
        int arrondi = 1000;
        for(int i = 1; i <= n; i++) {
            somme += (float) 1/i;
        }
        return (float)Math.round(somme *arrondi)/arrondi;
    }

    static void triangle(int n) {
        for (int i =0; i<n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void isocele(int n) {
        for (int i =0; i<n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            int k = 1;
            while (k<=i*2) {
                System.out.print("*");
                k++;
            }
            System.out.println("*");
        }
    }

    static void combinations() {
        int[] pieces = {2, 5, 10};
        for (int p : pieces) {
            int reste = 100 % p;
            if(reste == 0) {
                System.out.println("1€ = " +(100/p) + "* " + p + "C");
            }
        }
        int count =0;
        for(int i = 0 ; i <= 50; i++) {
            for (int j = 0; j <= 20; j++) {
                for (int k = 0; k <= 10; k++) {
                    if(i*2 + j*5 +k*10 == 100) {
                        System.out.println("1€ = "+i+"*2C + "+j+"*5C +" + k +"*10C" );
                        count++;
                    }
                }
            }
        }
        System.out.println("Il y a " + count + " façons de faire 1 euro");
    }

    static void conjugaison(String verbe) {
        verbe = verbe.toLowerCase();
        String er = verbe.substring(verbe.length() - 2);
        String sousverbe = verbe.substring(0, verbe.length() - 2);
        HashMap<String,String> conjugaison = new HashMap<>();
        conjugaison.put("je","e");
        conjugaison.put("tu","es");
        conjugaison.put("il/elle","e");
        conjugaison.put("nous","ens");
        conjugaison.put("vous","ez");
        conjugaison.put("ils","ent");

        if (er.equals("er")) {
            for (Map.Entry article : conjugaison.entrySet()) {
                System.out.println(article.getKey() + " " + sousverbe+article.getValue());
            }
            // conjugaisons tries
            System.out.println("-------Conjugaisons tries----------");
            Map conjug2 = new TreeMap(conjugaison);

            Set <Map.Entry <TreeSet<String>, String >> elements = conjug2.entrySet();

            for(Map.Entry<TreeSet<String>,String> element: elements) {
                System.out.println(element.getKey() + " "+ sousverbe+element.getValue());
            }
        } else {
            System.out.println("fournisez un verbe svp");
        }
    }
}
