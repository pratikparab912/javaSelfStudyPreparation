package com.java11.day2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee.display(new Employee(100,"Pratik",6666.50));
        Employee.display(new Employee(101,"Mitesh",6789.00));

    }


    static
    {
        System.out.println("Main class static block printing");
    }
}
