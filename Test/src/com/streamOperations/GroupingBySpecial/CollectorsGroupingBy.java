package com.streamOperations.GroupingBySpecial;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
    public static void main(String[] args) {
        List<Person> names = Arrays.asList(
                new Person("Pratik","Kalyan"),
                new Person("Sachin","Thane"),
                new Person("Rahul","Kalyan")
        );

        Map<String, List<Person>> collect = names.stream().collect(Collectors.groupingBy(Person::getCity));
        System.out.println(collect);
    }
}
