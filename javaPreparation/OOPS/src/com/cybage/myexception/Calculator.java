package com.cybage.myexception;

public class Calculator {
	public int division(int num1 , int num2)throws ClassNotFoundException {
		int div = 0;
		Class.forName("");
			int num[] = {10,20,30};
			System.out.println(num[4]);
			String message = null;
			System.out.println(message.length());
		System.out.println("In Division");
		
		 div = num1 / num2;
		
		System.out.println("Division in method = " + div);
		
		
		return div;
	}
	public int addition(int num1 , int num2) {
		System.out.println("In Addition");
		int sum = num1 + num2;
		System.out.println("Addition in method = " + sum);
		return sum;
	}
}
