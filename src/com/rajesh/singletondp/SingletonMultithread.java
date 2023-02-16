package com.rajesh.singletondp;

public class SingletonMultithread {

	static SingletonMultithread s=null;
	public SingletonMultithread() {}
	

	synchronized static SingletonMultithread getInstance() {
		if(s==null) 
			s=new SingletonMultithread();
		
		return s;
	}
}
