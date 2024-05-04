package com.company;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if(employee1.empAge == employee2.empAge) {
           return 0;
        } else if (employee1.empAge > employee2.empAge) {
            return 1;
        } else {
            return -1;
        }
    }
}
