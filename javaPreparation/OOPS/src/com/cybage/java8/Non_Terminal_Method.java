package com.cybage.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * filter, map, flatMap, distinct, sorted, limit, and skip.
 */
public class Non_Terminal_Method 
{
	public static void main(String[] args) {
		
		
		
		List<String> employees=Arrays.asList("Ram","Sham","Ram","Jam","Tam","Tom");
		
		List<String> emp=employees.stream().distinct().collect(Collectors.toList());
		System.out.println(emp);
		
//		employees.stream().distinct().forEach(name->System.out.println(name));
		employees.stream().distinct().forEach(System.out::println);


		
//		limit
		System.out.println("Only Find 2 Records :-");
		employees.stream().distinct().limit(2).forEach(employee->System.out.println(employee));
		
		
		
		
	}
	
	

}