package com.rajesh.observerdp;

// this used to broadcast the messages
public class ObserverDesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Follower indu=new Follower("Indu");
       Follower prashant=new Follower("Prashant");
       Follower vikram=new Follower("Vikram");
       Follower krish=new Follower("Krish");
       
       InsuranceCompany LIC= new InsuranceCompany("LIC");
       InsuranceCompany TATA= new InsuranceCompany("TATA");
       
       LIC.addSubscriber(indu);
       LIC.addSubscriber(prashant);
       TATA.addSubscriber(vikram);
       TATA.addSubscriber(krish);
       
       LIC.tweet(" Hi we are introducing new plan ");
       TATA.tweet(" Hi , website will be down from 12 am to 1am ");
	}

}
