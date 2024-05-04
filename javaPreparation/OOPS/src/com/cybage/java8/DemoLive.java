package com.cybage.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoLive {

	public static void main(String[] args) {
		//DemoLive.demoFilter();
		
		//DemoLive.demoMap();
		DemoLive.demoMapEmployee();

	}
	public static void demoMapEmployee() {
		List<Employee> listEmployee = Arrays.asList(new Employee(101,"Ram",60),
				new Employee(101,"Sham",60),
				new Employee(101,"Jam",40),
				new Employee(101,"Ram",30));
		
		//List of employees having all names as Capital/Uppercase
		List<Employee> listEmployeeUpper = listEmployee.stream()
												.map(employee->{
													
													employee.setName(employee.getName().toUpperCase());
													return employee;
												})
												.collect(Collectors.toList());
			System.out.println(listEmployeeUpper);
	}
	public static void demoMap() {
		List<String> names=Arrays.asList("Ram","Sham","Jam");
		System.out.println("Actual List:"+names);
		
		//convert every name to upper case
		System.out.println("Map Result:-");
		names.stream().
			map(name->name.toUpperCase())
				.forEach(name->System.out.println(name));
		
		
		List<Integer> length= names.stream()
				.map(name->name.length())
					.collect(Collectors.toList());
		System.out.println(length);
		
		Map<String,Integer> data= names.stream()
				.collect(Collectors.toMap(name->name, name->name.length()));
	System.out.println(data);
	}
	public static void demoFilterEmployee() {
		//Display All records of employee having name as "Ram"
		List<Employee> listEmployee = Arrays.asList(new Employee(101,"Ram",60),
					new Employee(101,"Sham",60),
					new Employee(101,"Jam",60),
					new Employee(101,"Ram",60));
		
		listEmployee.stream()
			.filter(employee->employee.getName().equals("Ram"))
				.forEach(employee->System.out.println(employee));
		
		listEmployee.stream()
		.filter(employee->employee.getName().equals("Ram"))
			.forEach(employee->System.out.println(employee));
			
				
	}
	public static void demoFilter() {
		List<Integer> info = Arrays.asList(10,15,20,25,30);
		info.stream()
			.filter(data->data%2==0)
				.forEach(data->System.out.println(data));
		
		//Create New List with Even Numumbers
		List<Integer> evenList = info.stream()
		.filter(data->data%2==0)
			.collect(Collectors.toList());
		
		System.out.println(evenList);
	}

}
