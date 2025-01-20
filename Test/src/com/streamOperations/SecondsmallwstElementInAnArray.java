package com.streamOperations;

import java.util.Arrays;

public class SecondsmallwstElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,1,3,4,2};
        int number = Arrays.stream(arr)
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array does not have second smallest number"));

        System.out.println(number);
    }
}
