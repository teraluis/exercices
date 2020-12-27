package chifoumi;

public class Joueur {
    public String nom;
    public int score = 0;
    public IHMSaisie saisie;

    Joueur(String nom, int score) {

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

}
