package com.cybage.inheritance;

public class C extends B{
	protected int c;
	public C() {
		//super(20);
		System.out.println("In Default Constructor C");
	}
	public C(int c) {
		//super(20);
		System.out.println("In Parameterised Constructor C " + c);
	}
	public void show() {
		super.show();
		System.out.println("In Show C");
	}
}
