package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numbers = list.stream().filter(a -> a > 5).collect(Collectors.toList());
        System.out.println(numbers);
    }
}
