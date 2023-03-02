package com.rajesh.adapterdp;

public class Bank implements BillDesk {
	
	String paymentType=null;
	String data=null;

	@Override
	public void setPaymentType(String paymentType) {
		// TODO Auto-generated method stub
		this.paymentType=paymentType;
	}

	@Override
	public String getPaymenType() {
		// TODO Auto-generated method stub
		return paymentType;
	}

	@Override
	public void setDetails(String data) {
		// TODO Auto-generated method stub
		this.data=data;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return data;
	}

}
