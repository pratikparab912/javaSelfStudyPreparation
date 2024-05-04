package com.cybage.aggregation;

public class TestEmployeeAsset {

	public static void main(String[] args) {
		Asset asset = new Asset(101,"Laptop","Acer");
		Employee employee = new Employee(1001,"Sachin",60);
		employee.setAsset(asset);
		
		System.out.println(employee);
		System.out.println(employee.getAsset());

	}

}
