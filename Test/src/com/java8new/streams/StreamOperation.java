package com.java8new.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);


        List<String> list = Arrays.asList("Pratik","Amit","Amol");
        list.stream().forEach(System.out::println);

        String[] array = {"Pratik","Amit","Amol"};
        Arrays.stream(array).forEach(System.out::println);

        Stream.iterate(1, n -> n + 1).limit(100).forEach(System.out::println);


    }
}
