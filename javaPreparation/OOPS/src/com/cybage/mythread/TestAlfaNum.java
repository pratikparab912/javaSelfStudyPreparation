package com.cybage.mythread;

public class TestAlfaNum {

	public static void main(String[] args) {
		MyThreadAlfa alfaThread = new MyThreadAlfa();
		Thread t = new Thread(alfaThread);//New Born phase
		t.start();//Runnable

		MyThreadNum numThread = new MyThreadNum();

		numThread.start();

	}

}
