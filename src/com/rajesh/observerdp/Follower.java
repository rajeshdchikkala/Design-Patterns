package com.rajesh.observerdp;

public class Follower implements ReceiveNotification {
	
	String name;
	
	Follower(String name){
		this.name=name;
	}

	@Override
	public void notification(String tweet) {
		System.out.println(name+" recieved notification "+tweet );
	}

}
