package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> limitNumbers = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitNumbers);

        int limitSum = list.stream().limit(5).mapToInt(Integer::intValue).sum();
        System.out.println(limitSum);

        List<Integer> skipLimitNumbers = list.stream().limit(5).skip(2).collect(Collectors.toList());
        System.out.println(skipLimitNumbers);
    }
}
