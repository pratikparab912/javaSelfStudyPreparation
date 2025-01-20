package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,-222,234,567,453,257);
        List<Integer> numberWith2 = list.stream()
                .map(String::valueOf)
                .filter(a -> a.startsWith("2") || a.startsWith("-2"))
                .map(Integer::new)
                .collect(Collectors.toList());
        System.out.println(numberWith2);
    }
}
