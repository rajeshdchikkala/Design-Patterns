package com.rajesh.builderdp;

public class UserWithoutBuilder {
	
	private String firstName;
	private String lastName;
	private int age; //not required
	private long mobile;//not required
	
	//say in future we need some more properties then we have to write more number of constructors then we have to add constructors with 19 fields
	
	// make user as immuable class then use builder design pattern
	
	public UserWithoutBuilder(String firstName, String lastName, int age, long mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age; //N
		this.mobile = mobile;
	}
	
	
	//some people uses only first name and last name
    public UserWithoutBuilder(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
    

// some people use fn,ln and mobile
	public UserWithoutBuilder(String firstName, String lastName, long mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
	}


	public static void main(String[] args) {
		// issues with this :-when we have new object then we have to use the correct constructor or say like if i have the 10 fields then we have to manage the constructors field values and we can make mistake in passing data.
		//1) too many constructors
		//2) incorrect state of object
		//to fix above issue we use builder design pattern
		
	}	

}
