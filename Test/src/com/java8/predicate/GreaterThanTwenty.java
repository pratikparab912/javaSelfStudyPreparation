package com.java8.predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {
    public static void main(String[] args) {
        Predicate<Integer> number = a->(a>20);
        System.out.println(number.test(23));
        System.out.println(number.test(19));
    }
}
