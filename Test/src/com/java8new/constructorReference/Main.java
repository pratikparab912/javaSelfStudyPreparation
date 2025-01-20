package com.java8new.constructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice","Bob","Charlie");
        List<Student> stringList = students.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
