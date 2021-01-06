package chifoumi;

public class Jeu {
    private int reach;

    public Jeu() {
        JeuxUnTour jeuxUnTour = new JeuxUnTour("luis", "Clara");
        do {
            jeuxUnTour.tour();
            jeuxUnTour.ecrireScore();
        }while (jeuxUnTour.j2.score + jeuxUnTour.j2.score < 5);
        System.out.println("---------------Score FINAL-------------");
        jeuxUnTour.ecrireScore();
        jeuxUnTour.conclure();
    }
}
