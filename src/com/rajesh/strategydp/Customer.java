package com.rajesh.strategydp;

public class Customer {
	private CustomerType c;
	public Customer(CustomerType c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	
	void showInterestRate() {
		c.interestRate();
	}
}
