package com.java8.lambdas.anonymous;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread( () -> {
            for (int i=1; i<=10; i++) {
                System.out.println("Child Thread");
            }
        }
        );

        thread.start();

        for(int i=1; i<=10; i++) {
            System.out.println("Main Thread");
        }

        System.out.println("\n");
    }
}
