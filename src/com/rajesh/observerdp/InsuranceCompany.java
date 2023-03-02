package com.rajesh.observerdp;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany implements ManageSubscribesAndNotify {

	String name;
	
	List<ReceiveNotification> subscriberList = new ArrayList<ReceiveNotification>();
	
	public InsuranceCompany(String name) {
		super();
		this.name = name;
	}

	@Override
	public void addSubscriber(ReceiveNotification observer) {
		subscriberList.add(observer);
	}

	@Override
	public void removeSubscriber(ReceiveNotification observer) {
		subscriberList.remove(observer);
	}

	@Override
	public void notifySubscribers(String tweet) {
		subscriberList.forEach(f->f.notification(tweet));
	}
	
	public void tweet(String tweet) {
		notifySubscribers(tweet);
	}

}
