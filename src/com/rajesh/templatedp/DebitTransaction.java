package com.rajesh.templatedp;

public class DebitTransaction extends Transaction {

	Account a;
	
	public DebitTransaction(Account a) {
		super();
		this.a = a;
	}

	@Override
	public boolean authenticate() {
		// TODO Auto-generated method stub
		System.out.println("Debit Authenticate");
		return true;

	}

	@Override
	public boolean validateInput(double amt) {
		// TODO Auto-generated method stub
		if(amt<0.0) {
			System.out.println("validate and amount is negative");
			return false;
		}else {
			System.out.println("validate and amount is non negative");
			return true;
		}
	}

	@Override
	public boolean performTransaction(double amount) {
		// TODO Auto-generated method stub
		a.debitTransaction(amount);
		return true;
	}


}
