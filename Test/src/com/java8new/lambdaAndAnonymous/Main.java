package com.java8new.lambdaAndAnonymous;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "1000000";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
}
