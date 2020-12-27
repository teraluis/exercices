package parallel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaParallel {

    public static void main(String [] args) {
        System.out.println("====================");
        System.out.println("Using sequential stream");
        System.out.println("====================");

        int [] array = {1, 2, 3, 4, 5, 6};

        IntStream intArrayStream = Arrays.stream(array);

        intArrayStream.map(s -> {
            if (s<5) {
                return 1;
            } else {
                return 5;
            }
        });

        System.out.println("====================");
        System.out.println("Using parallel stream");
        System.out.println("====================");
        IntStream intParallelStream = Arrays.stream(array).parallel();
        intParallelStream.forEach(s -> System.out.println(s + " " +Thread.currentThread().getName()));

    }
}
