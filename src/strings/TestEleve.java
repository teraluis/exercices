package strings;

import eleve.Eleve;
import eleve.GroupeEleves;

public class TestEleve {
    public static void main(String[] args) {
        Eleve eleve = new Eleve("Luis");
        Eleve eleve2 = new Eleve("Clara");
        eleve.addNote(17);
        eleve.addNote(18);
        eleve.addNote(19);
        eleve.addNote(20);
        eleve.addNote(15);
        eleve.addNote(14);

        eleve2.addNote(8);
        eleve2.addNote(9);
        eleve2.addNote(11);
        eleve2.addNote(14);

        GroupeEleves eleves = new GroupeEleves();
        eleves.ajoutterEleve(eleve);
        eleves.ajoutterEleve(eleve2);
        eleves.lister();
        Eleve eleveTrouve = eleves.chercher("Clara");
        if(eleveTrouve == null) {
            System.out.println("eleve non trouvé");
        }else {
            System.out.println(eleveTrouve.toString());
        }

    }
}
