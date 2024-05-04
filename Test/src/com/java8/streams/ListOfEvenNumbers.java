package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i=1;i<=10;i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        long count = numbers.stream()
                .count();
        System.out.println(count);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        double avg = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);

        System.out.println("\n");

//        List<Integer> evenNumbers = new ArrayList<>();
//        for(Integer i : numbers) {
//            if(i%2==0) {
//                evenNumbers.add(i);
//            }
//        }
//
//        System.out.println(evenNumbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        long countEvenNumbers = numbers.stream().filter(a -> a % 2 == 0).count();
        System.out.println(countEvenNumbers);

        int sumOfEvenNumbers = numbers.stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfEvenNumbers);

        double avgEven = numbers.stream()
                .filter(a -> a % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avgEven);

    }
}
