package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(average);

        List<Integer> squareList = list.stream().map(a -> a * a).collect(Collectors.toList());
        System.out.println(squareList);

        List<Integer> newSquareList = list.stream().map(a -> a * a).filter(s -> s > 16).collect(Collectors.toList());
        System.out.println(newSquareList);

        double newSquareListAverage =
                list.stream().map(a -> a * a).filter(s -> s > 16).mapToDouble(Integer::doubleValue)
                        .average()
                                .orElse(0.0);
        System.out.println(newSquareListAverage);

        List<Integer> even = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd = list.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);

        Optional<Integer> sumOfMultipleOf5 = list.stream().limit(5).reduce((a, b)->a*b);
        System.out.println(sumOfMultipleOf5);
    }
}
