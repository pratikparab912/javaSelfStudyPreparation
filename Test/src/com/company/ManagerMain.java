package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManagerMain {
    public static void main(String[] args) {
        ArrayList<Manager> managerArrayList = new ArrayList<Manager>();
        managerArrayList.add(new Manager(1,"Sneha",42));
        managerArrayList.add(new Manager(2,"Sujay",34));

        System.out.println("Sorting By Age : ");
        Collections.sort(managerArrayList);
//        for(Manager manager : managerArrayList) {
//            System.out.println(manager.id +" "+ manager.name +" "+ manager.age);
//        }
        managerArrayList.forEach(System.out::println);

        System.out.println("\nCustom Comparator : Sorting By Name :- ");
        Collections.sort(managerArrayList, new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return o1.name.compareTo(o2.name);
            }
        });
//        for(Manager manager : managerArrayList) {
//            System.out.println(manager.id +" "+ manager.name +" "+ manager.age);
//        }
        managerArrayList.forEach(System.out::println);
    }
}
