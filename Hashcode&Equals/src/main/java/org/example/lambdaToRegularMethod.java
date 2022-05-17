package org.example;

import java.util.function.Function;

public class lambdaToRegularMethod {

    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();
        func.apply("Márton");   // 6
        System.out.println(func);

        System.out.println(getStringLength("Márton"));

    }

    public static int getStringLength(String text) {
        return text.length();
    }
}
