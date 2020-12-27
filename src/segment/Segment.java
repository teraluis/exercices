package segment;

public class Segment {
    public int extr1;
    public int extr2;

    public Segment(int extr1, int extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
        ordonne();
    }

    private void ordonne() {
        if (extr1 > extr2){
            int tampon;

            tampon = extr1;
            extr1 = extr2;
            extr2 = tampon;
        }
    }

    public int longeur() {
        return Math.abs(this.extr2 - this.extr1);
    }

    public boolean appartient(int x) {
        if( (x>extr1 && x<extr2) || (x<extr1 && x>extr2)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "segment [" + extr1 + ", " + extr2 + " ]";
    }
}
