package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,-222, 123, 234,567,453,257);

        List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascending);

        List<Integer> descending = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(descending);
    }
}
