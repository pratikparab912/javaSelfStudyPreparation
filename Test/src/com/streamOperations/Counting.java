package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Grapes");
        Long countItems = list.stream().count();
        System.out.println(countItems);

        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6);
        Long countNumbers = listNumbers.stream().count();
        System.out.println(countNumbers);
    }
}
