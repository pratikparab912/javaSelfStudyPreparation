package com.java8new.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationSecond {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,2,4,6,8);
        List<Integer> collect = list.stream().filter(a -> a % 2 == 0).map(a -> a * 4).distinct().limit(2).collect(Collectors.toList());
        System.out.println(collect);

        Set<Integer> integerSet = list.stream().filter(x -> x % 3 == 0).skip(1).collect(Collectors.toSet());
        System.out.println(integerSet);

        List<Integer> integerList = Stream.iterate(101, n -> n+1).limit(25).skip(10).collect(Collectors.toList());
        System.out.println(integerList);

        //Max Number
        int num = list.stream().min((a,b)->b-a).get();
        System.out.println(num);

        //SecondMax Number
        int num1 = list.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
        System.out.println(num1);

        //Min Number
        int num2 = list.stream().sorted().findFirst().get();
        System.out.println(num2);

        //SecondMax Number
        int num3 = list.stream().sorted().skip(1).findFirst().get();
        System.out.println(num3);
    }
}
