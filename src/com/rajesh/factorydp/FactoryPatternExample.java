package com.rajesh.factorydp;

public class FactoryPatternExample {
	
	public Notification createNotification(String mode) {
		if(mode.equalsIgnoreCase("SMS")) {
			Notification n= new SMSNotification();
			return n;
		}
		if(mode.equalsIgnoreCase("Email")) {
			Notification n= new EmailNotification();
			return n;
		}
		
		if(mode.equalsIgnoreCase("Push")) {
			Notification n= new PushNotification();
			return n;
		}
		
		return null;
	}

}
