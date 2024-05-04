package com.cybage.myinterface;

public class MyClass implements Parent1, Parent2{

	@Override
	public void putData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Parent1.super.show();
		Parent2.super.show();
		System.out.println("MyClass version show");
	}

	



}
