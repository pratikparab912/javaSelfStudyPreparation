package com.streamOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,6);
        Set<Integer> duplicateNumbers = list.stream().filter(a -> Collections.frequency(list, a) > 1).collect(Collectors.toSet());
        System.out.println(duplicateNumbers);
    }
}
