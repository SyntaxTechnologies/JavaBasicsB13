package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height");
		int height = input.nextInt();

		if (height < 60) {
			System.out.println("Person is short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("Person is medium");
		} else if (height > 72) {
			System.out.println("Person is tall");
		}

		System.out.println(" ----------------------------------- ");

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the day of the week today? Enter the number");
		int day = scan.nextInt();

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println(" ------------------------  ");

		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println(" ------------------------------------");

		System.out.println("Please enter a number");
		int num = scan.nextInt();

		if (num >= 1 && num <= 10) {
			System.out.println("small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("large");
		}

	}
}
