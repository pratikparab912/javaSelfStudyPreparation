package com.java8.predicate;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String[] args) {
        Predicate<String> str = a->(a.length()>5);
        System.out.println(str.test("xyz"));
        System.out.println(str.test("markram"));
    }
}
