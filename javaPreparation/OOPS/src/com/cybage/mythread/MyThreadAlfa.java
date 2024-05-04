package com.cybage.mythread;

public class MyThreadAlfa implements Runnable {
		public void run() {//Running
			for(int i = 65; i <= 90; i++) {
				System.out.println((char)i);
				
			}
		}
}
