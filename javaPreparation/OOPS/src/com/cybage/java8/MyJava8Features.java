package com.cybage.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.cybage.Employee;

public class MyJava8Features {

	public static void main(String[] args) {
		
		//MyJava8Features.demoStreams();
		//MyJava8Features.demoSumOfAllSalaryEmployee();
		MyJava8Features.demoPredicate();
	}
	public static void demoStreams() {
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int sum = list.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sum);
	}
	public static void demoSumOfAllSalaryEmployee() {
		// Create an ArrayList of Employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000));
        employees.add(new Employee(2, "Alice", 60000));
        employees.add(new Employee(3, "Bob", 70000));

        // Calculate the sum of empSalary using streams
        double totalSalary = employees.stream()
                                      .mapToDouble(Employee::getEmpSalary)
                                      .sum();

        // Print the total salary
        System.out.println("Total salary of all employees: " + totalSalary);
	}
	public static void demoPredicate() {
		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 2 == 0;
			}
			
		};
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(15));
	}

}
