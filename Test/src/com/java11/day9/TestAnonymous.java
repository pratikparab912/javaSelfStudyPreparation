package com.java11.day9;

import com.java11.day7.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class TestAnonymous {
    public static void main(String[] args) {
        //TestAnonymous.demoOperation();
        //TestAnonymous.demoPredicate();
        //TestAnonymous.demoPredicateWithLambda();
        //TestAnonymous.demoOperationWithLambda();
        //TestAnonymous.demoComparatorWithLambda();
        TestAnonymous.demoForEachPrintWithLambda();
    }

    public static void demoOperation() {
        Operation operation = new Operation() {
            @Override
            public void addition(int n1, int n2) {
                System.out.println(n1+n2);
            }

//            @Override
//            public void division(int n1, int n2) {
//                System.out.println(n1/n2);
//            }
        };
        operation.addition(10,5);
       // operation.division(10,2);
    }

    public static void demoPredicate() {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));
    }

    public static void demoPredicateWithLambda() {
        Predicate<Integer> predicate = num -> num % 2 == 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));
    }

    public static void demoOperationWithLambda() {
        Operation operation = (n1, n2) -> System.out.println(n1+n2);
        operation.addition(10,20);
    }

    public static void demoComparatorWithLambda() {
        Comparator<Employee> comparator = (Employee emp1, Employee emp2) -> {
            return Integer.compare(emp1.getEmpId(),emp2.getEmpId());
        };
        System.out.println(comparator.compare(new Employee(101,"Ram",500), new Employee(101,"Ram",500)));
        System.out.println(comparator.compare(new Employee(102,"Ram",500), new Employee(101,"Ram",500)));
        System.out.println(comparator.compare(new Employee(100,"Ram",500), new Employee(101,"Ram",500)));
    }

    public static void demoForEachPrintWithLambda() {
        List<String> list = new ArrayList<String>();
        list.add("Ram");
        list.add("Dev");
        list.add("Anjali");
        list.add("Rahul");
        list.add("Tina");
        list.add("Anjali");
        list.add("null");
        list.add("null");
        //list.forEach(name-> System.out.println(name));
        list.forEach(System.out::println);
    }
}
