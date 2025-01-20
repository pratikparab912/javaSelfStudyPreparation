package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple","banana","grapes");
        List<Integer> result = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(result);
    }
}
