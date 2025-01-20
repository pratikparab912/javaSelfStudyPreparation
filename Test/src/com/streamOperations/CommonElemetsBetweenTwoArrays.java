package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElemetsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,1};

        List<Integer> result = Arrays.stream(arr1)
                .filter(
                        numberFromArray1 -> Arrays.stream(arr2)
                                .anyMatch(numberFromArray2 -> numberFromArray2 == numberFromArray1))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
