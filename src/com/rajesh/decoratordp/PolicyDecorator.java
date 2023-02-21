package com.rajesh.decoratordp;

 abstract class PolicyDecorator implements BasicPlan {
	 
	 BasicPlan bp;
	 
	public PolicyDecorator(BasicPlan bp) {
		super();
		this.bp = bp;
	}

	@Override
	public int getPremium() {
		return bp.getPremium();
	}

	@Override
	public String policyDetails() {
		return bp.policyDetails();
	}

}
