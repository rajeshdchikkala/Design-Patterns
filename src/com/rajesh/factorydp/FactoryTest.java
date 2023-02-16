package com.rajesh.factorydp;

public class FactoryTest {

	public static void main(String[] args) {
	   
		System.out.println("<-------------Factory Pattern start------------->");
		FactoryPatternExample f= new FactoryPatternExample();
		Notification sms= f.createNotification("SMS");
		sms.notifyDetails();
		Notification email= f.createNotification("Email");
		email.notifyDetails();
		//So if we want to add new funtionality like push method notification we dont have to change all classes. 
		// we have to add new class as push notification and implements with notification
		Notification push= f.createNotification("Push");
		push.notifyDetails();
		System.out.println("<-------------Factory Pattern end------------->");
		
		//output 
		/*<-------------Factory Pattern------------->
		Triggering notification by SMS
		Triggering notification by Email
		Triggering notification by Push
		<-------------Factory Pattern end------------->*/
		
	}

}
