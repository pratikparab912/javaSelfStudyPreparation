package com.cybage.myexception;

public class MyException {
	public void myDatabase() {
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
