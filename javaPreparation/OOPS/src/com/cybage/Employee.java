package com.cybage;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private  int empId;
	private String empName;
	private double empSalary;
	
	@Override
	public int hashCode() {
		//return Objects.hash(empId, empName, empSalary);
		System.out.println("In hashCode method");
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals method");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}
	//Constructor
	public Employee() {//Non Parameterised
		//this(105,"Tom",43);
	
		System.out.println("In Non Parameterised Constructor");
	}
	public Employee(int empId,String empName,double empSalary) {//Parameterised
		System.out.println("In Pameterised Constructor");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;	
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		if(empId <=9999) {
			this.empId = empId;
		}
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	@Override
	public int compareTo(Employee employee) {
		if(this.empSalary > employee.empSalary) {
			return 1;
		}else if(this.empSalary < employee.empSalary) {
			return -1;
		}else {
			return 0;
		}
		
	}
	//101 Ram 60
	//102 Ram 60
	

}
