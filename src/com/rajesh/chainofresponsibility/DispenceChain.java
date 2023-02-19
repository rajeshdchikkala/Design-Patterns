package com.rajesh.chainofresponsibility;

public interface DispenceChain {
	
	void dispence(Currency current);
	
	void chain(DispenceChain d);

}
