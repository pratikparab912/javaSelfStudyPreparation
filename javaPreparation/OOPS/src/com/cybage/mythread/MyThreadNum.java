package com.cybage.mythread;

public class MyThreadNum extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 25; i++) {
				System.out.println(i);
				//sleep();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
