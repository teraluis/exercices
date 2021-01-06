package chifoumi;

public class Joueur {

    public String nom;
    public int score = 0;
    public IHMSaisie saisie;

    public Joueur(String name) {
        this.nom = name;
    }

    public void crediter() {
        this.score++;
    }

    public void choisir() {
        saisie.proposerChoix();
    }

    public int getter() {
        return score;
    }

    public void ecrireScore() {
        System.out.println("Le score de " +this.nom+ " est " + score);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
