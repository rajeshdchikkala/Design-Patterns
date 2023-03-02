package com.rajesh.observerdp;

public interface ManageSubscribesAndNotify {
	public void addSubscriber(ReceiveNotification observer);


	public void removeSubscriber(ReceiveNotification observer);


	public void notifySubscribers(String tweet);
}
