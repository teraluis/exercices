import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Dichotomie {
    public static void main(String args[]) {
        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 45; i++) {
            numbers.add(getRandom(1, 89));
        }
        Collections.sort(numbers);
        int search = 20;
        do {
            search++;
        }while (!numbers.contains(search));
        System.out.println("on cherche " + search);
        showList(numbers);
        System.out.println("Recherche par dichotomie : ");
        System.out.println("position de " + search + " : " + dichotomieIteration(numbers, 0, numbers.size() -1, search));


    }
    static int getRandom(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    static int dichotomieRec(List<Integer> list, int deb, int fin, int value) {
        if(fin>=deb) {
            int m = deb + (fin - deb)/2;
            System.out.println(m +  " -> " + list.get(m));
            if(list.get(m) == value ) {
                return m;
            } else if(list.get(m) > value) {
                return dichotomieRec(list, deb, m-1, value);
            } else {
                return dichotomieRec(list, m+1, fin, value);
            }
        } else {
            return -1;
        }
    }

    static int dichotomieIteration(List<Integer> list, int deb, int fin, int value) {
        int m = (fin - deb) / 2  + deb;
        while (deb <= fin) {
            if(list.get(m) == value) {
                return m;
            } else if(list.get(m) > value) {
                return dichotomieIteration(list, deb, m - 1, value);
            } else {
                return dichotomieIteration(list, m + 1, fin, value);
            }
        }
        return -1;
    }
    static void showList(List<Integer> numbers) {
        int i = 0;
        for(int number : numbers) {
            System.out.println(i + " " +number);
            i++;
        }
    }
}

