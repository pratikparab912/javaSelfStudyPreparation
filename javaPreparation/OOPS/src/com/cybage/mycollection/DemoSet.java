package com.cybage.mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cybage.Employee;

public class DemoSet {

	public static void main(String[] args) {
		DemoSet.demoHashSet();
		//DemoSet.demoLinkedHashSet();
		//DemoSet.demoTreeSet();
		//DemoSet.demoEmployeeHashSet();
		//DemoSet.demoEmployeeTreeSet();
		//DemoSet.demoEmployeeTreeSetComparator();
	}
	public static void demoHashSet() {
		Set<String> set = new HashSet<String>();
		set.add("Ram");
		set.add("Sham");
		set.add("sham");
		set.add("Jam");
		set.add(null);
		set.add(null);
		System.out.println(set);
	}
	public static void demoLinkedHashSet() {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Ram");
		set.add("Sham");
		set.add("Jam");
		System.out.println(set);
	}
	public static void demoTreeSet() {
		Set<String> set = new TreeSet<String>();
		set.add("Ram");
		set.add("Sham");
		set.add("Jam");
	//	set.add(null);
		System.out.println(set);
	}
	public static void demoEmployeeHashSet() {
		Set<Employee> set = new HashSet<Employee>();
		Employee employee1 = new Employee(101,"Ram",60);
		Employee employee2 = new Employee(102,"Sham",65);
		Employee employee3 = new Employee(103,"Jam",75);
		Employee employee4 = new Employee(103,"Jam",75);
		Employee employee5 = new Employee(104,"Taam",55);
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		set.add(employee5);
		//System.out.println(set);
		/*
		 * for(Employee employee: set) { System.out.println(employee); }
		 */
		
		Iterator<Employee> iterator = set.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee);
		}
	}
	public static void demoEmployeeTreeSet() {
		Set<Employee> set = new TreeSet<Employee>();
		Employee employee1 = new Employee(101,"Ram",60);
		Employee employee2 = new Employee(102,"Sham",65);
		//Employee employee3 = new Employee(103,"Jam",75);
		//Employee employee4 = new Employee(103,"Jam",75);
		set.add(employee1);
		set.add(employee2);
		set.add(new Employee(103,"Jam",75));
		set.add(new Employee(103,"Jam",75));
		set.add(new Employee(103,"Jam",75));
		System.out.println(set);
	}
	public static void demoEmployeeTreeSetComparator() {
		Set<Employee> set = new TreeSet<Employee>(new EmployeeNameComparator());
		Employee employee1 = new Employee(101,"Ram",60);
		Employee employee2 = new Employee(102,"Sham",65);
		//Employee employee3 = new Employee(103,"Jam",75);
		//Employee employee4 = new Employee(103,"Jam",75);
		set.add(employee1);
		set.add(employee2);
		set.add(new Employee(103,"Jam",75));
		set.add(new Employee(103,"Jam",75));
		set.add(new Employee(103,"Jam",75));
		System.out.println(set);
	}
}
