package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLowerCase {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("John");
        str.add("Peter");
        str.add("Michel");
        str.add("Don");
        System.out.println(str);

        List<String> lowerCase = str.stream()
                .map(a -> a.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(lowerCase);

        List<String> upperCase = str.stream()
                .map(a -> a.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCase);

        List<String> stringList = str.stream()
                .filter(a -> a.startsWith("M"))
                .collect(Collectors.toList());
        System.out.println(stringList);

    }
}
