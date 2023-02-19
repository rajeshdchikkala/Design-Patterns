package com.rajesh.chainofresponsibility;

import java.util.Scanner;

public class ChainOfResDispense {
	
	DispenceChain d;

	public ChainOfResDispense() {
		this.d= new Notes2000Rack();
		DispenceChain d1= new Notes500Rack();
		DispenceChain d2= new Notes100Rack();
		d.chain(d1);
		d1.chain(d2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainOfResDispense c= new ChainOfResDispense();
		while(true) {
			System.out.println("Please enter the amount to be withdraw");
			try (Scanner in = new Scanner(System.in)) {
				int withdrawAmount=in.nextInt();
				if(withdrawAmount!=0) {
					if(withdrawAmount%100 !=0) {
						System.out.println("Please eneter the amount in 100.");
						return;
					}else {
						c.d.dispence(new Currency(withdrawAmount));
					}
				}
			}
		}
	}

}
