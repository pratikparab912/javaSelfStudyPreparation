package com.cybage;

public class TestOuter {

	public static void main(String[] args) {
		//Nested Non static
		/*
		 * Outer outer = new Outer(); outer.display();
		 * 
		 * Outer.Inner inner = outer.new Inner(); inner.show();
		 */
		
		Outer.Inner inner = new Outer.Inner();

	}

}
