package com.java8.MethodReferences;

public class MyClass {

    public static void myNewMethod(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        MyInterface myInterface = a-> System.out.println(a);
        myInterface.myMethod(10);

        MyInterface myNewInterface = MyClass::myNewMethod;
        myNewInterface.myMethod(20);
    }
}
