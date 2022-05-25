package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {

		/*
		 * declare a secret number; you want to ask user to guess your secret number you
		 * code should keep asking to guess until user gets your secret number Once user
		 * gets the secret numbers -> you got it!
		 */

		int secretNum = 1;
		int guessedNum;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Guess my secret number");
			guessedNum = scan.nextInt();
		} while (guessedNum != secretNum);
		
		System.out.println("You got it");

	}
}
