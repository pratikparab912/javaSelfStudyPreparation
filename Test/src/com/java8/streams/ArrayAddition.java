package com.java8.streams;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};

        int multipleOfTwo = 0;
        int multipleOfThree = 0;
        int sum = 0;

        for(int i=0; i<= arr.length-1; i++) {
            multipleOfTwo = arr[i] * 2;
            sum += multipleOfTwo;
        }

        for(int i=0; i<= arr.length-1;i++) {
            multipleOfThree = arr[i] * 3;
            sum += multipleOfThree;
        }

        System.out.println(sum);
    }
}
