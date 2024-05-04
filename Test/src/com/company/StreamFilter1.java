package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i=101; i<=200;i++) {
            numbers.add(i);
        }

        List<Integer> values = numbers.stream()
                .filter(a -> a%2==0)
                .collect(Collectors.toList());

        System.out.println(values);

        long count = numbers.stream()
                .filter(a -> a%2==0)
                .count();
        System.out.println(count);


    }
}
