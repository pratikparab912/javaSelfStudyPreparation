package com.cybage.mythread;

public class TestAnnonimous {

	public static void main(String[] args) {
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				//Thread Logic
				for(int i = 97; i <= 122; i++) {
					System.out.println((char)i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		thread.run();
	}

}
