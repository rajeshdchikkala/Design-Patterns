package com.rajesh.strategydp;

public class StrategyDesignPatternBankExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c= new Customer(new PreferredCustomer());
		c.showInterestRate();
		
		Customer c1= new Customer(new RegularCustomer());
		c1.showInterestRate();
		
		Customer c2= new Customer(new BankEmployee());
		c2.showInterestRate();
	}
	
	/*void interestType(CustomerType c) {
	boolean flag=false;
	if(c instanceof PreferredCustomer)
	{
		flag=true;
	} if(c instanceof RegularCustomer) {
		
	}else if(c instanceof BankEmployee) {
		
	}
}*/

}
