package com.syntax.class07;

import java.util.Scanner;

public class HWCalculatorIf {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a digit!");
		int a=input.nextInt();
		
		System.out.println("Please enter a operator");
		char operator=input.next().charAt(0);
		
		System.out.println("Please enter a digit!");
		int b=input.nextInt();
		
		if (operator=='+') {
			System.out.println(a+b);
		}else if (operator=='*') {
			System.out.println(a*b);
		}else if (operator=='/') {
			System.out.println(a/b);
		}else if (operator=='-') {
			System.out.println(a-b);
		}else {
			System.out.println("Please enter valid operator");
		}
		
		
	}
}
