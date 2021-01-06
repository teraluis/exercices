package eleve;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Eleve {

    private String nom;
    private int note;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    public Eleve(String nom) {
        this.listeNotes = new ArrayList<Integer>();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addNote(int note) {
        this.listeNotes.add(note);
    }

    public double getMoyenne() {

        double moy = 0;
        for(int i = 0; i<listeNotes.size(); i++) {
            moy+=listeNotes.get(i);
        }
        return (moy/listeNotes.size());
    }

    public ArrayList<Integer> getNotes() {
        for(int note : listeNotes) {
            System.out.println(note);
        }
        return listeNotes;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return "[" + this.nom +", moyenne : " + df.format(this.getMoyenne()) + " ]";
    }
}
