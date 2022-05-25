package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score you get in quiz");
		int quiz = input.nextInt();
		
		System.out.println("Enter the score you get in midterm");
		int mid = input.nextInt();
		
		System.out.println("Enter the score you get in final");
		int fin = input.nextInt();
		
		int averageS = (quiz + mid + fin) / 3;

		System.out.println("Your average score is" + averageS);

		if (averageS >= 90) {
			System.out.println("Your grade is A");
		
		} else if (averageS >= 70 && averageS <= 90) {
			System.out.println("Your grade is B ");
		
		} else if (averageS >= 50 && averageS < 70) {
			System.out.println("Your grade is C");
		
		} else  {
			System.out.println("Your grade is F");
		}
		

		/* if you are A or B student --> you are doing great 
		 * otherwise --> please try to study more
		 */
	}
}
