package com.cybage.myexception;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) throws Exception {
		int div = 0;
		
		
		Calculator obj = new Calculator();
		try(Scanner sc = new Scanner(System.in);) {
			sc.nextInt();
			div = obj.division(10, 0);
		}catch(Exception e) {
			e.printStackTrace();
			//throw e;
			throw new NullPointerException();
		}
			
		System.out.println("In Main div = " + div);
		int sum = obj.addition(10, 2);
		System.out.println("In Main sum = " + sum);

	}

}
