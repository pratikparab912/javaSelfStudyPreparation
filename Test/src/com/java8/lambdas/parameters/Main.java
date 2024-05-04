package com.java8.lambdas.parameters;

public class Main {
    public static void main(String[] args) {
        Sum s = (a,b) -> System.out.println("Sum is : " +(a+b));
        s.add(10,20);
    }
}
