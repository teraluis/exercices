import segment.Segment;

public class Main {
    public static void main(String[] args) {
        Segment segment = new Segment(0,10);
        System.out.println("longueur " + segment.longeur());
        System.out.println("appartient " + segment.appartient(3));
    }
    public static int factorial(int n) {
        int factorial = 1;
        if(n >= 1) {
            for(int i = 2; i <= n ; i++) {
                factorial *= i;
            }
            return factorial;
        } else {
            return 1;
        }
    }
}


