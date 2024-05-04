package com.java11.day7;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getEmpId() == emp2.getEmpId()) {
            return 0;
        } else if(emp1.getEmpId() > emp2.getEmpId()) {
            return 1;
        } else
        return -1;
    }
}
