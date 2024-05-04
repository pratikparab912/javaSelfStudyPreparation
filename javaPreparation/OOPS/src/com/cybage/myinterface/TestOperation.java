package com.cybage.myinterface;

public class TestOperation {

	public static void main(String[] args) {
		Operation ref;
		Operation.multiply(0, 0);
		ref = new SimpleCalculator();
		ref.addition(0, 0);
		ref.division(0, 0);
		//ref.multiply(0,0);//No ERROR
		//ref = new Demo();
		//SimpleCalculator cal = new SimpleCalculator();
		//System.out.println(cal.addition(10, 20));//Static Polymorphiosm
		
		Demo obj = new Demo();
		System.out.println(obj.demo(new SimpleCalculator()));
		
		System.out.println(obj.demo(new ScientificCalculator()));

	}

}
