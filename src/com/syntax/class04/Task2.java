package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Write a program to store a value whether user has diploma or not. If user has
		 * a diploma, you should say congratulations, otherwise program should suggest
		 * to get a degree. Then if user has a degree program should check a gpa score.
		 * If gpa score is higher or equals to 3.5 → output should say “You are eligible
		 * for scholarship”, otherwise → “You should have studied harder” .
		 */

		boolean diploma = false;
		double gpa = 2;
		
		if (diploma) {
			System.out.println("congratulaions");
			
			if (gpa >= 3.5) {
				System.out.println("you are eligible for scholarship");
			} else  {
				System.out.println("you should've studied harder");
			}
			
		} else {
			System.out.println("get a degree");
		}

	}
}
