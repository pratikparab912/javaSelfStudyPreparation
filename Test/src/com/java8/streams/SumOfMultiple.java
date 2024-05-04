package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfMultiple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,7,6,4,-2,9);
        System.out.println(numbers);

        int sumOfMultipleOfTwo = numbers.stream()
                .map(a->a*2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfMultipleOfTwo);

        double avg = numbers.stream()
                .map(b -> b * 2)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);

        int sumOfMultipleOfThree = numbers.stream()
                .map(a -> a * 3)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfMultipleOfThree);

        double avgOther = numbers.stream()
                .map(c -> c * 3)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avgOther);

        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        Comparator<Integer> comparator = (d,e)->d.compareTo(e);

        Integer max = numbers.stream().max(comparator).get();
        System.out.println(max);
        Integer min = numbers.stream().min(comparator).get();
        System.out.println(min);
    }
}
