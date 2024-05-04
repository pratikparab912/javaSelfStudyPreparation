package com.cybage.composition;

public class TestCustomerAccount {

	public static void main(String[] args) {

		Customer customer = new Customer(101,"Sachin");
		Account account = new Account(1001,50,customer);

	}

}
