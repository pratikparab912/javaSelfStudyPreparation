package com.java8new.functionalInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = () -> "Software Engineer";
        System.out.println(myInterface.getname());

        MyInterface myInterface1 = () -> "Editor";
        System.out.println(myInterface1.getname());

        Runnable runnable = () -> {
            for (int i=1;i<=10;i++) {
                System.out.println("Hello " +i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
