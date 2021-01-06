package chifoumi;

public class JeuxUnTour {
    public Joueur j1;
    public Joueur j2;

    public JeuxUnTour(String name1, String name2) {
        this.j1 = new Joueur(name1);
        this.j2 = new Joueur(name2);
    }

    public void ecrireScore() {
        System.out.println(this.j1.nom + " " + this.j1.score);
        System.out.println(this.j2.nom + " " + this.j2.score);
    }

    public void tour() {
        //Saissie j1
        IHMSaisie saisie = new IHMSaisie(this.j1.nom);
        Choix choix1 = saisie.proposerChoix();
        //Saissie j1
        IHMSaisie saisie2 = new IHMSaisie(this.j2.nom);
        Choix choix2 = saisie2.proposerChoix();
        if(choix1 == Choix.CAILLOU && choix2 == Choix.CISEAUX) {
            this.j1.score++;
        }
        if(choix1 == choix2) {
            System.out.println("egalité");
        }
        if(choix2 == Choix.CAILLOU && choix1 == Choix.CISEAUX) {
            this.j2.score++;
        }
        if(choix1 == Choix.PAPIER && choix2 == Choix.CISEAUX) {
            this.j2.score++;
        }
        if(choix2 == Choix.PAPIER && choix1 == Choix.CISEAUX) {
            this.j1.score++;
        }
        if(choix2 == Choix.PAPIER && choix1 == Choix.CAILLOU) {
            this.j2.score++;
        }
        if(choix1 == Choix.PAPIER && choix2 == Choix.CAILLOU) {
            this.j1.score++;
        }
        if(choix1 == Choix.CISEAUX && choix2 == Choix.PAPIER) {
            this.j1.score++;
        }
    }

    public void conclure() {
        if (j1.score > j2.score) {
            System.out.println("Joueur " + j1.nom + " gagne");
        }else if(j1.score == j2.score) {
            System.out.println("Match null");
        } else {
            System.out.println("Joueur " + j2.nom + " gagne");
        }
    }

}
