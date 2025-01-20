package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWithDownStreamCollectors {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple","banana","cherry","grapes","date");
        Map<Integer, Long> result = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(result);
    }
}
