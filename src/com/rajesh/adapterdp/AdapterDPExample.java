package com.rajesh.adapterdp;

public class AdapterDPExample {

	public static void main(String[] args) {
		BillDesk bn= new Bank();
		bn.setPaymentType("UPI");
		bn.setDetails("989898989");
		
		PaytmInterface pm=PaymentAdapter.convertBillDeskToPaytm(bn);
		
		System.out.println(pm);
		
	}

}
