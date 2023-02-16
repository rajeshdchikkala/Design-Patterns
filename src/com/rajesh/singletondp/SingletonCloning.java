package com.rajesh.singletondp;

public class SingletonCloning implements Cloneable {

	static SingletonCloning s=null;
	public SingletonCloning() {
		
	}
	

	static SingletonCloning getInstance() {
		if(s==null) 
			s=new SingletonCloning();
		
		return s;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return s; //if we pass s then we will get same object hash code
		//if we pass super.clone(); then we willget two different objects.
	}
}
