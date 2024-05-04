package com.java11.day10;

import com.java11.day7.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9,10);
        System.out.println(list);
        //list.stream().filter(a->a%2==0).forEach(System.out::println);
        //list.stream().filter(a->a%2==0).forEach(a-> System.out.println(a));
        List<Integer> evenList = list.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<String> name = Arrays.asList("Ram","Dev","Anjali");
        List<String> filterName = name.stream().filter(a->a.length()>3 && a.length()<7).collect(Collectors.toList());
        System.out.println(filterName);

        List<Employee> employee = Arrays.asList(new Employee(1,"Ram",100),
                new Employee(2,"Ram",200), new Employee(3,"Anjali",300));

//        List<Employee> newEmployee = employee.stream().filter(a->a.getEmpName().equals("Ram")).collect(Collectors.toList());
//        System.out.println(newEmployee);

        employee.stream().filter(a->a.getEmpName().equals("Ram")).forEach(System.out::println);
        employee.stream().filter(a->a.getEmpId() == 3).forEach(System.out::println);
        employee.stream().filter(a->a.getEmpSalary()>100).forEach(System.out::println);

        //Map
//        System.out.println("Map Result :");
//        name.stream().map(a->a.toUpperCase()).forEach(System.out::println);
        List<String> mapResult = name.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
        System.out.println(mapResult);

        List<Integer> mapResultLength = name.stream().map(a->a.length()).collect(Collectors.toList());
        System.out.println(mapResultLength);

        Map<String,Integer> mapData = name.stream().collect(Collectors.toMap(a->a, a->a.length()));
        System.out.println(mapData);

        List<Employee> capitalName = employee.stream().map(a -> {
            a.setEmpName(a.getEmpName().toUpperCase());
            return a;
        }).collect(Collectors.toList());
        System.out.println(capitalName);

        List<Employee> salary = employee.stream().map(b-> {
            b.setEmpSalary(b.getEmpSalary()*2);
            return b;
        }).collect(Collectors.toList());
        System.out.println(salary);

        List<Employee> newSalary = employee.stream()
                                .filter(d-> d.getEmpSalary()<=200)
                                .map(d-> {
                                    d.setEmpSalary(d.getEmpSalary()*4);
                                    return d;
                                    })
                                .collect(Collectors.toList());
        System.out.println(newSalary);

    }
}
