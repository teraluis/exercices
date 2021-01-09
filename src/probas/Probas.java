package probas;

import java.util.stream.LongStream;

public class Probas {
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

    public long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public static int arrangements(int n, int p) {
        int number = 1;
        for(int i = n - p; i <= n ; i++) {
            number *= i;
        }
        return number;
    }

    public static int somme(int [] numbers) {
        int sum = 0;
        if(numbers == null) {
            return 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            System.out.println(n);
            if (n >= 10 && n <= 100) {
               sum +=n;
            }
        }
        return sum;
    }
}
