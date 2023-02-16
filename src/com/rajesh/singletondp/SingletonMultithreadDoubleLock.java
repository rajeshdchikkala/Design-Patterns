package com.rajesh.singletondp;

public class SingletonMultithreadDoubleLock {

	static SingletonMultithreadDoubleLock s=null;
	public SingletonMultithreadDoubleLock() {}
	

	 static SingletonMultithreadDoubleLock getInstance() {
		
		 if (s == null)
		    {
		      //synchronized block to remove overhead
		      synchronized (SingletonMultithreadDoubleLock.class)
		      {
		        if(s==null)
		        {
		          // if instance is null, initialize
		          s = new SingletonMultithreadDoubleLock();
		        }
		       
		      }
		    } 
		
		return s;
	}
}
