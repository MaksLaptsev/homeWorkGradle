package ru.clevertec;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("The numbers \"12\", \"79\" have been selected\n"+
                    "are these all positive numbers? - "+ClassUtils.isAllPositiveNumbers("12","79"));
        }else {
            System.out.println(Arrays.toString(args)+" The numbers have been selected\n" +
                    "are these all positive numbers? - "+ClassUtils.isAllPositiveNumbers(args));
        }
    }
}
