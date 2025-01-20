package com.java8new.comparator;

import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(4,"Pratik");
        map.put(2,"Amol");
        map.put(1,"Akshay");
        map.put(3,"Ganesh");
        System.out.println("Ascending Order according to Roll Number : " +map);

        Map<Integer,String> newMap = new TreeMap<>((a,b)->b-a);
        newMap.put(4,"Pratik");
        newMap.put(2,"Amol");
        newMap.put(1,"Akshay");
        newMap.put(3,"Ganesh");
        System.out.println("Descending Order according to Roll Number : " +newMap);
    }
}
