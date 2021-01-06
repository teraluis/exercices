package segment;

public class Cercle implements Comparable<Cercle> {

    protected int x, y;
    protected double rayon;

    public Cercle(int x, int y , double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }
    public String toString() {
        return "["+getX()+","+getY()+","+getRayon()+"]";
    }

    @Override
    public int compareTo(Cercle c) {
        if(rayon < c.rayon) {
            return -1;
        } else if(rayon == c.rayon) {
            return 0;
        } else {
            return 1;
        }
    }
}
