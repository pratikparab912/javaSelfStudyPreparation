package com.company;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Even
//        System.out.println("Even Numbers :");
//        numbers.stream()
//                .filter(a -> a%2==0)
//                .forEach(System.out::println);

        //Odd
//        System.out.println("\nOdd Numbers :");
//        numbers.stream()
//                .filter(a -> a%2!=0)
//                .forEach(System.out::println);

        //Divisible By 2
//        System.out.println("\nDivisible By 2 :");
//        numbers.stream()
//                .filter(a -> a%2==0)
//                .forEach(System.out::println);

        //Divisible By 3
//        System.out.println("\nDivisible By 3 :");
//        numbers.stream()
//                .filter(a-> a%3==0)
//                .forEach(System.out::println);

        //Divisible By 5
//        System.out.println("\nDivisible By 5 :");
//        numbers.stream()
//                .filter(a-> a%5==0)
//                .forEach(System.out::println);

        //Sum
//        System.out.println("\nSum");
//        int sum = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum);

        //Average
//        System.out.println("\nAverage");
//        double avg = numbers.stream()
//                .mapToDouble(Integer::doubleValue)
//                .average()
//                .orElse(0.0);
//        System.out.println(avg);

        List<Integer> numbers = Arrays.asList(2,1,7,6,4,-2,9);

        int sum = numbers.stream()
                .map(a -> a * 2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        int sum1 = numbers.stream()
                .map(a -> a * 3)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);
    }
}
