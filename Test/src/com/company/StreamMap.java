package com.company;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Baban", "Chhaya", "Deepak");

        names.stream()
                .map(a -> a.toLowerCase())
                .forEach(System.out::println);
        System.out.println("\n");
        names.stream()
                .map(a -> a.toUpperCase())
                .forEach(System.out::println);

        System.out.println("\n");
        names.stream()
                .filter(a -> a.startsWith("B"))
                .forEach(System.out::println);
    }
}
