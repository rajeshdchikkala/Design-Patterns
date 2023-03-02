package com.rajesh.adapterdp;

public interface PaytmInterface {
	void setTypeOfPayment(String paymentType);
	String getTypeOfPayment();
	
	void provideDetails(String data);
	String getDetails();
}
