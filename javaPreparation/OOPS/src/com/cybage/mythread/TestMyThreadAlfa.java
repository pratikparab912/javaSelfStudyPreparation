package com.cybage.mythread;

public class TestMyThreadAlfa {

	public static void main(String[] args) {
		MyThreadAlfa alfaThread = new MyThreadAlfa();
		Thread t = new Thread(alfaThread);
		t.start();

	}

}
