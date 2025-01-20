package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry");
        Map<String, Integer> result = list.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(result);

        Map<String, Integer> resultAnother = list.stream().collect(Collectors.toConcurrentMap(Function.identity(), String::length));
        System.out.println(resultAnother);
        //for thread safety
    }
}
