package com.rajesh.chainofresponsibility;

public class ChainOfReponsibilityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();

	}
	
	static void m1() {
		m2();
	}
	
	static void m2() {
		m3();
	}
	
	static void m3() {
		int c= 10/0;
	}

	/*
	 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.rajesh.chainofresponsibility.ChainOfReponsibilityExample.m3(ChainOfReponsibilityExample.java:21)
	at com.rajesh.chainofresponsibility.ChainOfReponsibilityExample.m2(ChainOfReponsibilityExample.java:17)
	at com.rajesh.chainofresponsibility.ChainOfReponsibilityExample.m1(ChainOfReponsibilityExample.java:13)
	at com.rajesh.chainofresponsibility.ChainOfReponsibilityExample.main(ChainOfReponsibilityExample.java:8)

	 */
}
