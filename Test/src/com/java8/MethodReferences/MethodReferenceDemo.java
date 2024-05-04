package com.java8.MethodReferences;

public class MethodReferenceDemo {

    public static void myMethod() {
        for(int i=1;i<=10;i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = MethodReferenceDemo::myMethod;
        Thread thread = new Thread(runnable);
        thread.start();

        //Parent Thread
        for(int i=1;i<=10;i++) {
            System.out.println("Parent Thread");
        }

        System.out.println("\n");
    }
}
