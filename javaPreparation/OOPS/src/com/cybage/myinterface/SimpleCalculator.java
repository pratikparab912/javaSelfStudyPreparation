package com.cybage.myinterface;

public class SimpleCalculator implements Operation {

	@Override
	public int addition(int num1, int num2) {
		System.out.println("Addition of SimpleCalculator");
		return num1 + num2;
	}

	@Override
	public int division(int num1, int num2) {
		System.out.println("Division of SimpleCalculator");
		return num1 / num2;
	}

	/*
	 * @Override public int multiply(int num1 , int num2) { return num1 * num2; }
	 */
	@Override
	public int sunstraction(int num1 , int num2) {
		return 0;
	}

}
