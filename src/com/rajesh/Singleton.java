/**
 * 
 */
package com.rajesh;

/**
 * @author rajesh
 * whenever user tries to create a class from out side we should not allow .
 * in eager initialization the object will be created event hough we are not creating or calling singleton class.
 * as we know static will be loaded on class load so it will create object
 * and will use memory.
 */
public class Singleton {
	//This is known as eager initiaization.Problem with above code is object is getting created on class loading.
	static Singleton s = new Singleton(); //Eager initialization

	private Singleton(){}
	
	static Singleton getInstance() {
		 return s;
	}

}
