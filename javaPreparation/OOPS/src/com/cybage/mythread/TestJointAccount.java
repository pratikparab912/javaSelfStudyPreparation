package com.cybage.mythread;

public class TestJointAccount {

	public static void main(String[] args) {
		JointAccount account = new JointAccount(10000);
		ParentThread parent = new ParentThread(account);
		ChildThread child = new ChildThread(account);
		parent.start();
		child.start();

	}

}
