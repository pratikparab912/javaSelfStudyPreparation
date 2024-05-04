package com.java8.lambdas.basics;

public class Main {
    public static void main(String[] args) {
//        A a = new C();
//        a.myMethod();

        A a = ()-> System.out.println("Inside MyMethod");
        a.myMethod();
    }
}
