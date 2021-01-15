package math;

public class RacineCarre {

    private double precision;

    public RacineCarre(double precision) {
        this.precision = precision;
    }

    public double racine(double operande)
    {
        double solution, carre, a, b;

        a = 0;
        b = operande;
        solution  =(a+b)/2;
        while (b - a > precision) {
            carre = solution * solution;
            if (carre > operande) b = solution;
            else a = solution;
            solution = (a + b) / 2;

            System.out.println("a " + a);
            System.out.println("b " + b);
            System.out.println("solution " + solution);
            System.out.println("b - a " + (b-a));
        }
        return solution;
    }
    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

}
