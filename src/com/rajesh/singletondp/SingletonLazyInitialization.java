/**
 * 
 */
package com.rajesh.singletondp;

/**
 * @author rajesh
 *
 */
public class SingletonLazyInitialization {

	//Lazy Initialization
	static SingletonLazyInitialization s=null;
	public SingletonLazyInitialization() {
		
	}
	

	static SingletonLazyInitialization getInstance() {
		if(s==null) 
			s=new SingletonLazyInitialization();
		
		return s;
	}
	
}
