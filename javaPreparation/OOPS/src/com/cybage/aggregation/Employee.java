package com.cybage.aggregation;

public class Employee {
	private  int empId;
	private String empName;
	private double empSalary;
	private Asset asset;
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public String toString() {
		return empId + " " + empName + " " + empSalary;
	}
}
