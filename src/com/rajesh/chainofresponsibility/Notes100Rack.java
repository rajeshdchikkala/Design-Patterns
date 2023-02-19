package com.rajesh.chainofresponsibility;

public class Notes100Rack implements DispenceChain {
	
	DispenceChain c;

	@Override
	public void dispence(Currency current) {
		// TODO Auto-generated method stub
        int noof100Notes=(int)current.getAmount()/100;
        System.out.println("Dispencing "+noof100Notes+ " 100 notes");
        int reminder=(int)current.getAmount()%100;
        if(reminder!=0) {
        	  this.c.dispence(new Currency(reminder));	
        }		
    }

	@Override
	public void chain(DispenceChain d) {
		// TODO Auto-generated method stub
		//c.chain(d);
		this.c=d;
	}

	

}
