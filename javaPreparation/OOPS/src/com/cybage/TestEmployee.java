package com.cybage;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("In Main begin");

		TestEmployee obj = new TestEmployee();
		obj.createObject();// invoke
		System.out.println("Main END");

	}
	public void main() {
		
	}

	public void createObject() {
		/*
		 * Employee employee1 = new Employee(); Employee employee2 = new Employee();
		 * Employee employee3 = new Employee(); Employee employee4 = new Employee();
		 */
		 int num;
		//employee1.display();
		Employee emp1 = new Employee(110,"Niteen",1);
		System.out.println("After emp1 creation in main");
		//Employee.display(emp1);
		
		
		  Employee emp2 = new Employee(111,"Sachin",5);
		 
		  //emp2.empId = 1002;
		  emp2.setEmpId(1002);
		  System.out.println("After emp2 creation in main");
		  //Employee.display(emp2);
		 
		
		
	}
	
	static{
		System.out.println("In Empty block of TestEmployee1");
		
	}
	static{
		System.out.println("In Empty block of TestEmployee2");
		
	}

}
