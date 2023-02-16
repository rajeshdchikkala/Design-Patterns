package com.rajesh.singletondp;

import java.io.Serializable;

public class SingletonSerialization implements Serializable{

	private static final long serialVersionUID = 1L;
	static SingletonSerialization ser=null;
	public SingletonSerialization() {
		
	}
	

	static SingletonSerialization getInstance() {
		if(ser==null) 
			ser=new SingletonSerialization();
		return ser;
	}
	
}
