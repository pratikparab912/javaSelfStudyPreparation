package com.streamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 222, 234, 567, 453, 257);

        //Min Value
        Integer min = list.stream().sorted().findFirst().get();
        System.out.println(min);

        Integer secMin = list.stream().sorted().skip(1).findFirst()
                .orElseThrow(()->new IllegalArgumentException("Array does not have second minimum number"));
        System.out.println(secMin);

        //Max Value
        Integer max = list.stream().min((a, b) -> b - a).get();
        System.out.println(max);

        Integer secMax = list.stream().sorted((a,b)->b-a).skip(1).findFirst()
                .orElseThrow(()->new IllegalArgumentException("Array does not have second maximum number"));
        System.out.println(secMax);

    }
}
