package com.cybage.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.cybage.Employee;

public class TestAnnonymous {

	public static void main(String[] args) {
		//TestAnnonymous.demoPredicate();
		//TestAnnonymous.demoPredicateWithLambda();
		//TestAnnonymous.demoOperation();
		//TestAnnonymous.demoComparatorAnnonymousClass();
		TestAnnonymous.demoForEachWithLambda();
		
	}
	public static void demoAnnonymousClass() {
		Operation operation = new Operation() {

			@Override
			public void addition(int num1 , int num2) {
				System.out.println("In Addition");
				
			}

			/*
			 * @Override public void division(int num1 , int num2) {
			 * System.out.println("In Division" + num1 / num2);
			 * 
			 * }
			 */
			
			
		};
		operation.addition(10,20);
		//operation.division(10, 5);
	}
	public static void demoPredicate() {
		Predicate<Integer> predicate = new Predicate<Integer> (){

			@Override
			public boolean test(Integer num) {
				
				return num % 2 == 0;
			}
			
		};
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(15));
	}
	public static void demoPredicateWithLambda() {
		Predicate<Integer> predicate = num->  num % 2 == 0;
	
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(15));
	}
	public static void demoOperation() {
		Operation operation = (num1 , num2) -> System.out.println("sum = " + (num1 + num2));
		
		operation.addition(10, 20);
	}
	public static void demoComparatorAnnonymousClass() {
		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee employee1, Employee employee2) {
				
				return Integer.compare(employee1.getEmpId(), employee2.getEmpId());
			}
			
		};
		System.out.println(comparator.compare(new Employee(99,"Ram",60), new Employee(101,"Ram",60)));
	}
	public static void demoComparatorLambda() {
		Comparator<Employee> comparator = (employee1,employee2)->{
			return Integer.compare(employee1.getEmpId(), employee2.getEmpId());
		};
		System.out.println(comparator.compare(new Employee(99,"Ram",60), new Employee(101,"Ram",60)));
	}
	
	public static void demoForEachWithLambda() {
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sham");
		list.add("Sham");
		list.add("Sham");
		list.add("Jaaam");
		list.add(null);
		list.add(null);
		list.forEach(name->System.out.println(name));
	}

}
