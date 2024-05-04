package com.cybage.abstraction;

abstract public class Shape {
	protected double area;
	public Shape() {
		System.out.println("In Shape Constructor");
	}
	abstract public void area();
	public void displayArea() {
		System.out.println("Area = " + area);
	}
}
