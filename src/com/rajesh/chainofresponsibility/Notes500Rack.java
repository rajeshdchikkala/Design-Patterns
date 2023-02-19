package com.rajesh.chainofresponsibility;

public class Notes500Rack implements DispenceChain {
	
	DispenceChain c;

	@Override
	public void dispence(Currency current) {
		// TODO Auto-generated method stub
        int noOf500Notes=(int)current.getAmount()/500;
        System.out.println("Dispencing "+noOf500Notes+ " 500 notes");
        int reminder=(int)current.getAmount()%500;
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
