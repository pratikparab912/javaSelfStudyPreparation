package com.cybage.polymorphism;

import java.util.Scanner;

public class Addition {
	
	  public void addition(int num1 , int num2) {
		  int sum = num1 + num2;
	      System.out.println("Sum = " + sum); 
	  }
	 
		
		  public void addition(double num1 , double num2) { 
			  double sum = num1 + num2;
		      System.out.println("Sum = " + sum); 
		  }
		 
	public static void main(String[] args) {
		Addition obj = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		obj.addition(num1, num2);
		obj.addition(num1, num2);
		obj.addition(num1, num2);
	}
}
