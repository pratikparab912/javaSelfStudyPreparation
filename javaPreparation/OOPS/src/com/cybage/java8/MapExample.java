package com.cybage.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * The map() method in the Java Stream API takes a single parameter:

A function represented by the Function<T, R> interface: This function should take an input of type T and 
return an output of type R. Here, T is the type of the elements in the input stream, 
and R is the type of the elements in the resulting stream.
Function<T, R> Interface
This interface is a part of the java.util.function package and is designed for operations 
that take a single argument and return a result. It is a functional interface, which means 
it can be implemented with a lambda expression or a method reference. The interface is defined as follows:


@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
 */
class Employee
{
	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return id+"\t"+name+"\t"+salary;
	}
	
}
public class MapExample
{
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ram","Sham","Jam");
		System.out.println("Actual List:"+names);
		
		//convert every name to upper case
		System.out.println("Map Result:-");
		names.stream().
			map(name->name.toUpperCase())
				.forEach(name->System.out.println(name));
		
		List<String> modified_string= names.stream()
					.map(name->name.toUpperCase())
						.collect(Collectors.toList());
			System.out.println(modified_string);
		
		//Find length of each String
		
		List<Integer> length= names.stream()
				.map(name->name.length())
				.collect(Collectors.toList());
		System.out.println(length);
		
		//Let map name and  length as K and V in map 
		
		Map<String,Integer> data= names.stream()
					.collect(Collectors.toMap(name->name, name->name.length()));
		System.out.println(data);
		
		
		//Get The element from List find square of them 
		
		List<Integer> info=Arrays.asList(1,2,3,4,5);
		System.out.println("Actual List:"+info);
		List<Integer> squares= info.stream().map(no->no*no).collect(Collectors.toList());
		System.out.println("Square:"+squares);
		
		//Filter And Map in combination
		
		List<Employee> employees=Arrays.asList(new Employee(1, "Ram",99000f),
											   new Employee(2, "Sham", 45000f),
											   new Employee(3, "Jam", 34000f),
											   new Employee(4,"Tam",40000f));	
		//It will give only Salary
		List<Float> emp= employees.stream().filter(employee->employee.salary<50000).map(employee->employee.salary+20000).collect(Collectors.toList());
		System.out.println(emp);
		System.out.println("");
		
		List<Employee> emp_list= employees.stream().filter(employee->employee.salary<50000)
				.map(employee->{
					employee.setSalary(employee.salary+20000);
					return employee;
					
				}).collect(Collectors.toList());
		
		for(Employee e:emp_list)
			System.out.println(e);
		
		
				
	
	
		

	}

}

