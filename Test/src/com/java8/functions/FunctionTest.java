package com.java8.functions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> str = a->a.length();
        System.out.println(str.apply("xyz"));
        System.out.println(str.apply("Pratik"));
    }
}
