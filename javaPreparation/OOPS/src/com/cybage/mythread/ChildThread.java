package com.cybage.mythread;

public class ChildThread extends Thread {
	private JointAccount account;
	public ChildThread(JointAccount account) {
		this.account = account;
	}
	public void run() {
		setName("ChildThread");
		account.withdraw(7000);
	}
}
