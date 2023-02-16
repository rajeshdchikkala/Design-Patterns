package com.rajesh.singletondp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
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
		
		System.out.println("Lazy Initialization equals:- "+ s2.equals(s3));
		System.out.println("Lazy Initialization hashcode s2:- "+s2.hashCode());
		System.out.println("Lazy Initialization hashcode s3:- "+s3.hashCode());
		
		 /*
		  * what are the mechanism to break singleton design pattern.
		  * Reflection ,cloning, serialization and multithreading is mechanism to break singleton
		  * the eager and lazy initialization will fail in above cases.
		  */
		
		/*
		 *  1. Serialize interface
		 *  objetout-> writeobject serialization
		 *             readobject deserialization
		 */
		try {
			System.out.println("---------Serialization----------");
			SingletonSerialization instance1 = SingletonSerialization.getInstance();
			FileOutputStream f = new FileOutputStream("E:\\Java-coding-interview-pocket-book\\serialization.txt");
			ObjectOutputStream obj = new ObjectOutputStream(f);
			obj.writeObject(instance1);
			obj.close();

			// deserialization
			FileInputStream f1 = new FileInputStream("E:\\\\Java-coding-interview-pocket-book\\serialization.txt");
			ObjectInputStream in = new ObjectInputStream(f1);
			SingletonSerialization instance2
            = (SingletonSerialization)in.readObject();
			in.close();
			 System.out.println("instance1 hashCode:- "
                     + instance1.hashCode());
             System.out.println("instance2 hashCode:- "
                     + instance2.hashCode());
             /*
              * ---------Serialization----------
				instance1 hashCode:- 1442407170
				instance2 hashCode:- 990368553
              */
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 try {
			 System.out.println("---------Serialization solution----------");
			 SingletonSerializationSolution instance1 = SingletonSerializationSolution.getInstance();
				FileOutputStream f = new FileOutputStream("E:\\Java-coding-interview-pocket-book\\serialization.txt");
				ObjectOutputStream obj = new ObjectOutputStream(f);
				obj.writeObject(instance1);
				obj.close();

				// deserialization
				FileInputStream f1 = new FileInputStream("E:\\\\Java-coding-interview-pocket-book\\serialization.txt");
				ObjectInputStream in = new ObjectInputStream(f1);
				SingletonSerializationSolution instance2
	            = (SingletonSerializationSolution)in.readObject();
				in.close();
				 System.out.println("instance1 hashCode:- "
	                     + instance1.hashCode());
	             System.out.println("instance2 hashCode:- "
	                     + instance2.hashCode());
	             /*
	              * ---------Serialization solution----------
					instance1 hashCode:- 1747585824
					instance2 hashCode:- 1747585824
	              */
	        }
	 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
		 
		    System.out.println("---------Multithread singleton----------");
		 
		    SingletonMultithread sm1=SingletonMultithread.getInstance();
		    SingletonMultithread sm2=SingletonMultithread.getInstance();
		
		    System.out.println("Multithread singleton equals:- "+ sm1.equals(sm2));
			System.out.println("Multithread singleton  hashcode sm1:- "+sm1.hashCode());
			System.out.println("Multithread singleton  hashcode sm2:- "+sm2.hashCode());
			
			System.out.println("---------Multithread singleton using double lock----------");
			 
			SingletonMultithreadDoubleLock smd1=SingletonMultithreadDoubleLock.getInstance();
			SingletonMultithreadDoubleLock smd2=SingletonMultithreadDoubleLock.getInstance();
		
		    System.out.println("Multithread singleton using double lock equals:- "+ smd1.equals(smd2));
			System.out.println("Multithread singleton using double lock hashcode sm1:- "+smd1.hashCode());
			System.out.println("Multithread singleton using double lock hashcode sm2:- "+smd2.hashCode());
			
			System.out.println("---------clone singleton----------");
			
			SingletonCloning s10 =SingletonCloning.getInstance();
			SingletonCloning s11=(SingletonCloning) s10.clone();
			System.out.println("cloning singleton using equals:- "+ s10.equals(s11));
			System.out.println("cloning singleton hashcode s10:- "+s10.hashCode());
			System.out.println("cloning singleton hashcode s11:- "+s11.hashCode());
			
			Singleton instance1 = Singleton.getInstance();
	        Singleton instance2 = null;
	        try {
	            Constructor[] constructors
	                = Singleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                // Below code will destroy the singleton
	                // pattern
	                constructor.setAccessible(true);
	                instance2
	                    = (Singleton)constructor.newInstance();
	                break;
	            }
	        }
	 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	        System.out.println("instance1.hashCode():- "
	                           + instance1.hashCode());
	        System.out.println("instance2.hashCode():- "
	                           + instance2.hashCode());
		
	}

}
