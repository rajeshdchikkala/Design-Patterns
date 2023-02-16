package com.rajesh.singletondp;

import java.io.Serializable;

public class SingletonSerializationSolution implements Serializable {

	private static final long serialVersionUID = 1L;
	static SingletonSerializationSolution ser=null;
	public SingletonSerializationSolution() {
		
	}
	

	static SingletonSerializationSolution getInstance() {
		if(ser==null) 
			ser=new SingletonSerializationSolution();
		return ser;
	}
	
	// implement readResolve method which will help in creating singleton object
    protected Object readResolve() { return ser; }
}
