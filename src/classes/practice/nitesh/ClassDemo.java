package classes.practice.nitesh;
package com.oop.gitHub;
 class A111 {
	A111(String name, String address){
System.out.println("My Name is " + name);
System.out.println("My Address is " + address);
}
	
		A111(int phoneNumber){
			System.out.println("My Phone Number is " +phoneNumber);
		}
 }
	
			

public class ClassDemo {

	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create simple class with few variables
	 *  2. Create few methods for class behavior 
	 *  3. create a main method and object for newly created.
	 *  4. Try to call differenet methods with multiple objects.
	 *  
	 */

	public static void main( String[] args ){  
 
		//TODO you need to create your logic here..
		
		A111 obj1 = new A111("Nitesh Dhungana", "31 Hamlin Rd");
		A111 obj2 = new A111(800800800);
		System.out.println("--------------------------");
		A111 obj3 = new A111("Dhungana  Nitesh", "53 Pisc way");
		A111 obj4 = new obj4("8118118111);
		
		

	}
}




