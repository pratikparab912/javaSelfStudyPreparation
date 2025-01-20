package com.java8new.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Pratik");
        Student student1 = new Student(2,"Ganesh");
        Student student2 = new Student(3,"Akshay");
        Student student3 = new Student(4,"Sagar");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Collections.sort(studentList, (a,b)->b.id- a.id);
        System.out.println(studentList);

    }

    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}


