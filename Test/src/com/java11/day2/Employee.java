package com.java11.day2;

public class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    static private String companyName = "Cybage Software Pvt Ltd.";

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    static public void display(Employee employee) {
        System.out.println(employee.empId + " " + employee.empName + " " + employee.empSalary + " " + companyName);
    }

    static {
        System.out.println("Employee class static block printing");
    }
}
