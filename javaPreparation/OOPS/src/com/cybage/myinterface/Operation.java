package com.cybage.myinterface;

public interface Operation {
	int addition(int num1, int num2);
	int division(int num1 , int num2);
	static int multiply(int num1 , int num2) {
		return 0;
	}
	default int sunstraction(int num1 , int num2) {
		return 0;
	}
}
