package com.streamOperations;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArray = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(reversedArray));
    }
}