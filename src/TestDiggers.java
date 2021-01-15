import segment.Cercle;

import java.util.Comparator;

public class TestDiggers {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++) {
            System.out.println(i +" "+FooBarQix(i));
        }
        System.out.println("13 "+FooBarQix(13));
        System.out.println("15 "+FooBarQix(15));
        System.out.println("21 "+FooBarQix(21));
        System.out.println("33 "+FooBarQix(33));
        System.out.println("51 "+FooBarQix(51));
        System.out.println("53 "+FooBarQix(53));
    }

    static String FooBarQix(int n) {
        String word ="";
        if(n % 3 == 0) {
            word+="Foo";
        }
        if(n % 5 == 0) {
            word+="Bar";
        }
        if(n % 7 == 0) {
            word+="Qix";
        }
        for(String d: String.valueOf(n).split("")){
            int digit = Integer.parseInt(d);
            if(digit == 3) {
                word+="Foo";
            }
            if(digit == 5) {
                word+= "Bar";
            }
            if(digit == 7) {
                word+="Qix";
            }
        }


        if(word.equals("")) {
            return String.valueOf(n);
        } else {
            return word;
        }
    }
}
