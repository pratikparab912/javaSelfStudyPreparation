package com.cybage.myinterface;
@FunctionalInterface
public interface Parent2 {
	public void putData();
	//public void show();
	default public void show() {
		System.out.println("In Parent 2 default show");
	}
	static public void display() {
		
	}
}
