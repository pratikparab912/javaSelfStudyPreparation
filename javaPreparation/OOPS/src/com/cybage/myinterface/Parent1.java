package com.cybage.myinterface;

public interface Parent1 {
	public void putData();
	default public void show() {
		System.out.println("In Parent 1 default show");
	}
}
