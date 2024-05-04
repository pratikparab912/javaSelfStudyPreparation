package com.java8.MethodReferences.constructors;

public class Main {

    public static void main(String[] args) {
        MyInterface myInterface = a->new MyConstructorClass(a);
        myInterface.get("Using Lambdas");

        MyInterface myConstructorInterface = MyConstructorClass::new;
        myConstructorInterface.get("Using Constructor Mapping");
    }
}
