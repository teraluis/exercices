package eleve;

import java.util.ArrayList;

public class GroupeEleves {

    private ArrayList<Eleve> eleves;

    public GroupeEleves() {
        this.eleves = new ArrayList<Eleve>();
    }

    public int nombre () {
        return this.eleves.size();
    }

    public void ajoutterEleve(Eleve eleve) {
        this.eleves.add(eleve);
    }

    public Eleve chercher(String eleve) {
        Eleve student = null;
        for (Eleve e : eleves) {
            if(e.getNom().equals(eleve)) {
                student = e;
            }
        }
        return student;
    }

    public void lister() {
        for (Eleve e : eleves) {
            System.out.println(e.toString());
        }
    }
}
