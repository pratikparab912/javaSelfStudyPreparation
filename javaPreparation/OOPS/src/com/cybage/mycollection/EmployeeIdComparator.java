package com.cybage.mycollection;

import java.util.Comparator;

import com.cybage.Employee;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getEmpId() > emp2.getEmpId()) {
			return 1;
		}else if(emp1.getEmpId() < emp2.getEmpId()) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
