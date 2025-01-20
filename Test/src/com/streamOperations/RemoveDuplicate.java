package com.streamOperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,5,5,6,6,7,8,9);
 //       List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        //       System.out.println(distinct);

        Set<Integer> distinct = new HashSet<>(list);
        System.out.println(distinct);
    }
}
