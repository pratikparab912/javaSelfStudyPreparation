package com.cybage.mythread;

public class JointAccount {
	private double balance;
	public JointAccount(double balance) {
		this.balance = balance;
	}
	synchronized public void withdraw(double amount) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Bance Before = " + balance);
		if(amount <= balance) {
			balance = balance - amount;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("Balance After = " + balance);
	}
}
