package com.rajesh.templatedp;

public abstract class Transaction {
	
	public abstract boolean authenticate();
	
	public abstract boolean validateInput(double amt);
	
	public abstract boolean performTransaction(double amt);
	
	public boolean updateLogsDB() {
		System.out.println("DB updates");
		return true;
	}
	
	public  boolean notifyUser() {
		System.out.println("Successfull/failed transaction");
		return true;
	}
	
	//keep the method as final else child class will override
	public final void templateMethod(double amt) {
		if(authenticate() && validateInput(amt) && performTransaction(amt) &&	updateLogsDB()) {
		  notifyUser();
		}
	}
	
}
