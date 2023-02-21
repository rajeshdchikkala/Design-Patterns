package com.rajesh.decoratordp;

public class DecoratorPatternExample {
	public static void main(String[] args) {
		BasicPlan karthickPolicy=new BasePolicy();
		System.out.println(karthickPolicy.getPremium());
		System.out.println(karthickPolicy.policyDetails());
		
		BasicPlan ajayPolicy=new BasePolicy();
		System.out.println(ajayPolicy.getPremium());
		System.out.println(ajayPolicy.policyDetails());
		
		ajayPolicy=new AccidentalBenifits(ajayPolicy);
		System.out.println(ajayPolicy.getPremium());
		System.out.println(ajayPolicy.policyDetails());
		
		karthickPolicy=new criticalBenefit(karthickPolicy);
		System.out.println(karthickPolicy.getPremium());
		System.out.println(karthickPolicy.policyDetails());
		
	}
	
}
