package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee(1,"Aman",32));
        arrayList.add(new Employee(2,"Baban",28));
        arrayList.add(new Employee(3,"Chaman",22));

        System.out.println("Sorting By Name : ");
        Collections.sort(arrayList, new NameComparator());
//        for(Employee employee : arrayList) {
//            System.out.println(employee.empId +" "+ employee.empName +" "+ employee.empAge);
//        }
        arrayList.forEach(System.out::println);

        System.out.println("\nSorting By Age : ");
        Collections.sort(arrayList, new AgeComparator());
//        for(Employee employee : arrayList) {
//            System.out.println(employee.empId +" "+ employee.empName +" "+ employee.empAge);
//        }

        arrayList.forEach(System.out::println);
    }
}
