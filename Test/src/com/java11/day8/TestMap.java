package com.java11.day8;

import com.java11.day7.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        //TestMap.demoMap();
        //TestMap.demoHashMapEmployee();
        TestMap.reversedHashMapEmployee();
    }

    public static void demoMap() {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"Pune");
        map.put(102,"Mumbai");
       //System.out.println(map.get(101));
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(i + " " +map.get(i));
        }

    }

    public static void demoHashMapEmployee() {
        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(new Employee(101, "Rahul", 300), "Pune");
        map.put(new Employee(102, "Anjali", 400), "GNR");
        map.put(new Employee(103, "Tina", 500), "HYD");
        map.put(new Employee(102, "Anjali", 400), "Pune");
        map.put(new Employee(105, "Dev", 700), "GNR");
        map.put(new Employee(106, "Ram", 800), "HYD");

        Set<Employee> set = map.keySet();
        for (Employee e : set) {
            System.out.println(e + " " + map.get(e));
        }
    }

        public static void reversedHashMapEmployee() {
            Map<String, Employee> map = new HashMap<String, Employee>();
            map.put("Pune", new Employee(101, "Rahul", 300));
            map.put("GNR", new Employee(102, "Anjali", 400));
            map.put("HYD", new Employee(103, "Tina", 500));
            map.put("Pune", new Employee(102, "Anjali", 400));
            map.put("GNR", new Employee(105, "Dev", 700));
            map.put("HYD", new Employee(106, "Ram", 800));

            Set<String> set = map.keySet();
            for (String s : set) {
                System.out.println(s + " " + map.get(s));
            }

        }
}


