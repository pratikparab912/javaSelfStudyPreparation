package com.java8new.comparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(45);
        set.add(13);
        set.add(27);
        System.out.println("Ascending Order : " +set);

        Set<Integer> newSet = new TreeSet<>((a,b)->b-a);
        newSet.add(3);
        newSet.add(45);
        newSet.add(13);
        newSet.add(27);
        System.out.println("Descending Order : " +newSet);
    }

}
