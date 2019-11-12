package controlstatements.practice.nitesh;

import java.util.Scanner;

public class ControlStatement {

	/**
	 * Please try to follow and create the following:
	 * 
	 * 1. Create multiple if-else-if statements 2. Create for, while and do-while
	 * loops 3. Create a method to use switch, case, break, continue statement. 4.
	 * Add few arithmetic operations 5. Add few logical operators
	 * 
	 */

	public static void main(String[] args) {

		int n = 0;
		Scanner in = new Scanner(System.in);
		Scanner days = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println("Trying to use if, else");
		
		System.out.print("Enter the value for a: ");
		int a = in.nextInt();
		if (a < 10) {
			System.out.println("Value of a is less then 10");

		} else if (a > 10) {
			System.out.println("Value of a is greater then 10");
		} else {
			System.out.println("Value is equal to 10");
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Perfroming some logical and arithmetic operations.");

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println(a + " is not prime number");

			} else {
				System.out.println(a+ " is a prime number");
			}
			
			System.out.println("----------------------");
		System.out.println("Entering for loop");
		for (int c = 0; c <= 5; c++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------");
		System.out.println("Entering while loop");
		while (a > 0) {
			System.out.println("I am printing value of a using loop and counter in decreasing order: " + a);
			a--;
		}
		System.out.println("-----------------------------------");
		System.out.println("Entering Do While loop");
		do {
			System.out.println("The numbers are " + n);
			n++;
		} while (n < 20);
		System.out.println("-------------------------------");
		System.out.println("Using Switch case statement");
		System.out.println("Enter the day to convert it into the name of the day: ");
		int day = days.nextInt();
		String dayString;

		switch (day) {
		case 1:
			dayString = "The day you selected is Monday";
			break;
		case 2:
			dayString = "The day you selected is Tuesday";
			break;
		case 3:
			dayString = "The day you selected is Wednesday";
			break;
		case 4:
			dayString = "The day you selected is Thursday";
			break;
		case 5:
			dayString = "The day you selected is Friday";
			break;
		case 6:
			dayString = "The day you selected is Saturday";
			break;
		case 7:
			dayString = "The day you selected is Sunday";
			break;
		default:
			dayString = "The day you selected is Invalid day";
			break;
		}
		System.out.println(dayString);
					
		}

	}

}
