package com.cybage;

public class Outer {
	public Outer() {
		System.out.println("Outer Constructor");
	}
	static public void display() {
		System.out.println("In Outer disply");
	}
	static class Inner{
		public Inner() {
			System.out.println("Inner Constructor");
		}
		public void show() {
			display();
			System.out.println("In Inner show method");
		}
	}

}
