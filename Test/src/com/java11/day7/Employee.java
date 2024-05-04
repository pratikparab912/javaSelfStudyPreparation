package com.java11.day7;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       System.out.println("In Equals Method");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(empSalary, employee.empSalary) == 0 && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
       System.out.println("In Hashcode Method");
        return Objects.hash(empId, empName, empSalary);
    }
}
