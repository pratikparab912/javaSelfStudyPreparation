package com.java8new.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(40);
        list.add(65);
        list.add(2);
        //Sorting according to descending order
        Collections.sort(list, (a,b)->b-a);
        System.out.println(list);
    }
}
