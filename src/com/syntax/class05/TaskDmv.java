package com.syntax.class05;

import java.util.Scanner;

public class TaskDmv {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter age");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("We will issue a DL for you");
		} else {
			System.out.println("We will offer you a learner's permit");
		}
	}
}
