package com.company;

public class FactorialRecursive {

    public static int recursiveFactorial(int number) {
        if(number==0) {
            return 1;
        } else {
            return (number * recursiveFactorial(number-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(FactorialRecursive.recursiveFactorial(5));
    }

}
