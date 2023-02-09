package com.rajesh.singletondp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Singleton s=new Singleton(); //we are getting error as we made constructor as private.
	//	Singleton s1=new Singleton();
		
		Singleton s=Singleton.getInstance();
		Singleton s1=Singleton.getInstance();
		
		System.out.println("Eager Initialization equals:- "+s.equals(s1));
		System.out.println("Eager Initialization hashcode s:- "+s.hashCode());
		System.out.println("Eager Initialization hashcode s1:- "+s1.hashCode());
		
		System.out.println("----------------------------------------------------");
		
		//Lazy initialization
		SingletonLazyInitialization s2=SingletonLazyInitialization.getInstance();
		SingletonLazyInitialization s3=SingletonLazyInitialization.getInstance();
		
		System.out.println("Lazy Initialization equals:- "+s2.equals(s3));
		System.out.println("Lazy Initialization hashcode s2:- "+s2.hashCode());
		System.out.println("Lazy Initialization hashcode s3:- "+s3.hashCode());
		
		 /*
		  * what are the mechanism to break singleton design pattern.
		  * Reflection ,cloning, serialization and multithreading is mechanism to break singleton
		  * the eager and lazy initialization will fail in above cases.
		  */
	}

}
