package com.cybage.composition;

public class Account {
	private int accountNumber;
	private double balance;
	private Customer customer;
	public Account(int accountNumber, double balance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}
}
