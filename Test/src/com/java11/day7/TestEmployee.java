package com.java11.day7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {
    public static void main(String[] args) {
        TestEmployee.fetchByHashSet();
        System.out.println("\n");
        System.out.println("Insertion Order");
        TestEmployee.fetchByLinkedHashSet();
        System.out.println("\n");
        TestEmployee.fetchByTreeSet();
    }


    public static void fetchByHashSet() {
        Set<Employee> employee = new HashSet<Employee>();
        employee.add(new Employee(101,"Ram",1000));
        employee.add(new Employee(102,"Dev",5000));
        employee.add(new Employee(103,"Anjali",500));
        employee.add(new Employee(103,"Anjali",500));
        employee.add(new Employee(104,"Tina",600));
        employee.add(new Employee(105,"Rahul",900));
        //System.out.println(employee);
        for(Employee e : employee) {
            System.out.println(e);
        }
    }

    public static void fetchByLinkedHashSet() {
        Set<Employee> employee = new LinkedHashSet<Employee>();
        employee.add(new Employee(101,"Ram",1000));
        employee.add(new Employee(102,"Dev",5000));
        employee.add(new Employee(103,"Anjali",500));
        employee.add(new Employee(103,"Anjali",500));
        employee.add(new Employee(104,"Tina",600));
        employee.add(new Employee(105,"Rahul",900));
        //System.out.println(employee);
        for(Employee e : employee) {
            System.out.println(e);
        }
    }

    public static void fetchByTreeSet() {
        Set<Employee> employee = new TreeSet<Employee>(new NameComparator());
        employee.add(new Employee(101,"Ram",1000));
        employee.add(new Employee(102,"Dev",5000));
        employee.add(new Employee(103,"Anjali",500));
        employee.add(new Employee(103,"Anjali",500));
        employee.add(new Employee(104,"Tina",600));
        employee.add(new Employee(105,"Rahul",900));
        //System.out.println(employee);
        employee.forEach(System.out::println);
    }
}
