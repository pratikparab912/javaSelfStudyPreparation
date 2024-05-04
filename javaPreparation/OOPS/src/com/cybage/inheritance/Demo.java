package com.cybage.inheritance;

import com.cybage.abstraction.Shape;
import com.cybage.abstraction.Triangle;

public class Demo {
	public void demo(A obj) {
		obj.show();
	}
	
	public void demo1(Shape shape) {
		shape.area();//
		shape.displayArea();
	}
}
