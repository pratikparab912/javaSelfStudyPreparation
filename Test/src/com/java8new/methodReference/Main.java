package com.java8new.methodReference;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        List<String> students = Arrays.asList("Pratik", "Ganesh", "Akshay");
        students.forEach(test::hello);
    }
}
