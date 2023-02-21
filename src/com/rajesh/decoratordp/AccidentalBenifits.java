package com.rajesh.decoratordp;

public class AccidentalBenifits extends PolicyDecorator {

	public AccidentalBenifits(BasicPlan bp) {
		super(bp);
	}
	
	@Override
	public int getPremium() {
		// TODO Auto-generated method stub
		return super.getPremium()+58;
	}

	@Override
	public String policyDetails() {
		// TODO Auto-generated method stub
		return super.policyDetails()+ " and Additiona Accidental benefits";
	}
}
