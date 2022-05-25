package com.syntax.class05;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 * 
		 */

		int age = 23;
		int weight = 100;
		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
				System.out.println("You are eligible to be a donor.");
			} else {
				System.out.println("You are " + age + " years old, and your weight is " + weight
						+ " lbs. It is less then 110 lbs.");
				System.out.println("You are not eligible to be a donor.");
			}
		} else {
			System.out.println("You are not eligible to be a donor. You are younger than 18 years old.");
		}

		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */
		
		int num1 = 65;
		int num2 = 66;
		int num3 = 23;
		
		if (num1 >= num2) {
				if (num1 >= num3) {
					System.out.println(num1 + " is largest number");
				} else {
					System.out.println(num3 + " is largest number");
				}
		}else { //otherwise num2>num1
				if (num2>=num3) {
					System.out.println(num2 + " is largest number");
				}else { //num3>num2
					
					System.out.println(num3 + "is the largest number");
				}
		}
	}
}
