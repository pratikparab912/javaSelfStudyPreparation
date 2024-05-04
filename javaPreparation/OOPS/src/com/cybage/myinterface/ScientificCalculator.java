package com.cybage.myinterface;

public class ScientificCalculator implements Operation {

	@Override
	public int addition(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Addition of ScientificCalculator");
		return num1 + num2;
	}

	@Override
	public int division(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("division ScientificCalculator");
		return num1 / num2;
	}



}
