package com.cybage.abstraction;

import com.cybage.inheritance.Demo;

public class TestShape {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle();
		shape.area();
		shape.displayArea();
		
		shape = new Triangle();
		shape.area();
		shape.displayArea();
		
		Demo obj = new Demo();
		//obj.demo1(new Triangle());
		Triangle t =new Triangle();
		obj.demo1(t);
		obj.demo1(new Circle());

	}

}
