package com.rajesh.templatedp;

/**
 * 
 * @author rajesh
 * 
 * templatemethod is used as template as it will go through all method and will check each method
 */

public class TemplateDesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("SVC", 10000);
		Transaction st= new DebitTransaction(a);
		st.templateMethod(10000);
		Transaction st2= new  CreditTransaction(a);
		st2.templateMethod(-3000); 
	}

}
