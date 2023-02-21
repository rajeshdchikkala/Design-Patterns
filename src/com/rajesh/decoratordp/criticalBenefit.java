package com.rajesh.decoratordp;

public class criticalBenefit  extends PolicyDecorator{

	public criticalBenefit(BasicPlan bp) {
		super(bp);
	}
	
	@Override
	public int getPremium() {
		// TODO Auto-generated method stub
		return super.getPremium()+650;
	}

	@Override
	public String policyDetails() {
		// TODO Auto-generated method stub
		return super.policyDetails()+ " and Additional critical benefits";
	}
}
