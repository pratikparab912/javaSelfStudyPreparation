package com.java8new.streams;

import java.util.Arrays;

public class AdditionOfEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //int sum = Arrays.stream(arr).filter(a -> a % 2 == 0).sum();
        int sum = Arrays.stream(arr).sum();
        int evenSum = Arrays.stream(arr).filter(a->a%2==0).sum();
        System.out.println(sum);
        System.out.println(evenSum);
    }
}
