package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap1 {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Aman");
//        names.add("Baban");
//        names.add("Charlie");
//        System.out.println(names);

//        names.stream()
//                .map(a->a.toUpperCase())
//                .forEach(System.out::println);

        List<String> names = Arrays.asList("Aman","Baban","Charlie");
        System.out.println(names);

        List<String> ans = names.stream()
                .map(a->a.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ans);

        List<String> answer = names.stream()
                .map(a->a.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(answer);

        List<String> str = names.stream()
                .filter(a->a.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(str);

    }
}
