package com.cybage.inheritance;

final public class A {
	protected int a;
	public A() {
		System.out.println("In Default Constructor A");
	}
	public A(int a) {
		System.out.println("In Parameterised Constructor A" + a);
	}
	final public void show() {
		System.out.println("In Show A");
	}
}
