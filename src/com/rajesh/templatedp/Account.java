package com.rajesh.templatedp;

public class Account {
	
	String accountHolderName;
	double accountBalancce;
	
	
	
	public Account(String accountHolderName, double accountBalancce) {
		this.accountHolderName = accountHolderName;
		this.accountBalancce = accountBalancce;
	}



	public void debitTransaction(double amtTobeDebited) {
		accountBalancce=accountBalancce-amtTobeDebited;
	}
	
	public void creditTransaction(double amtTobeDebited) {
		accountBalancce=accountBalancce+amtTobeDebited;
	}

}
