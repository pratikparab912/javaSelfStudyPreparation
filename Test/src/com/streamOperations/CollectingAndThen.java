package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingAndThen {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple","banana","grapes","banana");
        Integer result = names.stream().collect(Collectors.collectingAndThen(Collectors.toList(), List::size));
        System.out.println(result);

        Integer distinctResult = names.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
        System.out.println(distinctResult);
    }
}
