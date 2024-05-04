package com.cybage.inheritance;

public class B extends A {
	protected int b;
	/*
	 * public B() { super(10); System.out.println("In Default Constructor B"); }
	 * public B(int b) { super(10);
	 * System.out.println("In Parameterised Constructor B " + b); }
	 */
	
	public void show() {
		//super.show();
		System.out.println("In Show B");
	}
}
