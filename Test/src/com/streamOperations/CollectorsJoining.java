package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pratik", "Ganesh", "Amol");
        String collect = names.stream().collect(Collectors.joining(", "));
        System.out.println(collect);
    }

}
