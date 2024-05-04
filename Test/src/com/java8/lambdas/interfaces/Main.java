package com.java8.lambdas.interfaces;

public class Main {
    public static void main(String[] args) {
//        Runnable runnable = new MyRunnableImpls();
//        Thread thread = new Thread(runnable);
//        thread.start();

        Runnable runnable = () -> {
            for (int i=1;i<=10;i++) {
                System.out.println("Child Thread");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i=1; i<=10; i++) {
            System.out.println("Main Thread");
        }
        System.out.println("\n");
    }
}
