package com.rajesh.adapterdp;

public class PaymentAdapter{
	
	static PaytmInterface pm;
	
	public PaymentAdapter(PaytmInterface pm) {
		super();
		this.pm = pm;
	}
	
	static PaytmInterface convertBillDeskToPaytm(BillDesk b){
		pm.setTypeOfPayment(b.getPaymenType());
		pm.provideDetails(b.getDetails());
		return pm;
	}
}
