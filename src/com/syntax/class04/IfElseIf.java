package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * declare 2 numbers and verify which one is the largest
		 */

		int num1 = 20;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println(num1 + " is the larger than " + num2);

		} else if (num2 > num1) {
			System.out.println(num2 + " is the larger than " + num1);

		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println(" ------------------------------------   ");
		/*
		 * the moment Java finds true condition -> it executes that block and exist
		 * entire if statement
		 */

		int day = 9;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		}

	}
}
