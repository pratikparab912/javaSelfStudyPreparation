package com.cybage.mycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cybage.Employee;

public class DemoMap {

	public static void main(String[] args) {
		//DemoMap.demoHashMap();
		DemoMap.demoHashMapEmployee();
	}
	public static void demoHashMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Pune");
		map.put(102, "Hydrabad");
		map.put(103, "GNR");
		map.put(104, "GNR");
		//System.out.println(map);
		//System.out.println(map.get(104));
		Set<Integer> set = map.keySet();
		for(Integer pincode: set) {
			System.out.println(pincode + " " + map.get(pincode));
		}
	}
	public static void demoHashMapEmployee() {
		Map<Employee,String> map = new HashMap<Employee,String>();
		Employee employee1 = new Employee(101,"Ram",60);
		Employee employee2 = new Employee(102,"Sham",65);
		Employee employee3 = new Employee(103,"Jam",75);
		Employee employee4 = new Employee(103,"Jam",75);
		Employee employee5 = new Employee(104,"Taam",55);
		map.put(employee1, "Pune");
		map.put(employee2, "Hyd");
		map.put(employee3, "GNR");
		map.put(employee4, "Hyd");
		map.put(employee5, "Pune");
		
		//System.out.println(map);
		Set<Employee> set = map.keySet();
		for(Employee employee: set) {
			System.out.println(employee + " " + map.get(employee));
		}
		
	}

}
