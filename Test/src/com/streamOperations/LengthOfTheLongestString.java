package com.streamOperations;

import java.util.Arrays;
import java.util.List;

public class LengthOfTheLongestString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple","banana","cheries");
        int maxLength = names.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println(maxLength);

    }
}
