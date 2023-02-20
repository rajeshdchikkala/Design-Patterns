package com.rajesh.builderdp;

public class User {
	//to make it immutable add final
	final private String firstName;
	final private String lastName;
	final private int age; //not required
	final private long mobile;//not required
	
	User(UserBuilder ub){
		this.firstName=ub.firstName;
		this.lastName=ub.lastName;
		this.age=ub.age;
		this.mobile=ub.mobile;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public long getMobile() {
		return mobile;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName is "+ firstName +" LastName is "+lastName+ " age is "+age+" mobile is "+mobile;
	}
	
	//create inner class
	static class UserBuilder{
		private String firstName;
		private String lastName;
		private int age;
		private long mobile;
		//create a constructor with mandatory field
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		//for optional create method
		public UserBuilder age(int age) {
			this.age=age;
			return this;
		}
		
		public UserBuilder mobile(long mobile) {
			this.mobile=mobile;
			return this;
		}
		
		User build() {
			User u= new User(this);
			return u;
		}
		
		
	}
	
	public static void main(String[] args) {
		User u=new User.UserBuilder("abcd", "efg").age(10).mobile(999999999).build();
		System.out.println(u);
		System.out.println(" HashCode of u is "+u.hashCode());
		User u1=new User.UserBuilder("abcd", "efg").build();
		System.out.println(u1);
		System.out.println(" HashCode of u1 is "+u1.hashCode());
		User u4=new User.UserBuilder("abcd", "efg").build();
		System.out.println(u4);
		System.out.println(" HashCode of u4 is "+u4.hashCode());
		User u2=new User.UserBuilder("nop", "qrst").age(15).build();
		System.out.println(u2);
		System.out.println(" HashCode of u2 is "+u2.hashCode());
		User u3=new User.UserBuilder("uvw", "xyz").mobile(88888888).build();
		System.out.println(u3);
		System.out.println(" HashCode of u3 is "+u3.hashCode());
	}
	
	/** Output: So hashcode will be different when we create object using builder pattern.
	 * FirstName is abcd LastName is efg age is 10 mobile is 999999999
		 HashCode of u is 366712642
		FirstName is abcd LastName is efg age is 0 mobile is 0
		 HashCode of u1 is 1829164700
		FirstName is abcd LastName is efg age is 0 mobile is 0
		 HashCode of u4 is 2018699554
		FirstName is nop LastName is qrst age is 15 mobile is 0
		 HashCode of u2 is 1311053135
		FirstName is uvw LastName is xyz age is 0 mobile is 88888888
		 HashCode of u3 is 118352462
	 */
	
}
