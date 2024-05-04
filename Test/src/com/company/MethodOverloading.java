package com.company;

public class MethodOverloading {

    public void printSalary(int salary) {
        System.out.println("Salary Without bonus : " +salary);
    }

    public void printSalary(int salary, int bonus) {
        System.out.println("Salary with bonus : " +(salary+bonus));
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.printSalary(20000);
        methodOverloading.printSalary(20000,1000);

    }
}
