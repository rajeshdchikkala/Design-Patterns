package com.rajesh.chainofresponsibility;

public class Notes2000Rack implements DispenceChain {
	
	DispenceChain c;

	@Override
	public void dispence(Currency current) {
		// TODO Auto-generated method stub
        int noOfNotes=(int)current.getAmount()/2000;
        System.out.println("Dispencing "+noOfNotes+ " 2000 notes");
        int reminder=(int)current.getAmount()%2000;
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
