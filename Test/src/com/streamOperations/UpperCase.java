package com.streamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pratik", "Ganesh", "Amol");
        List<String> newNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newNames);

        List<String> ascending = names.stream().sorted().collect(Collectors.toList());
        System.out.println(ascending);

        List<String> descending = names.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descending);

        String collect = names.stream().collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
