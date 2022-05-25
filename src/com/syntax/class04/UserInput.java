package com.syntax.class04;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		//creating a scanner
		// input - is a variable name that hold your Scanner
		Scanner input=new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please enter your name");
		
		//we need to grab the values from console
		//To read string values, we use next()
		String name=input.next(); //after you type the value -> hit enter
		System.out.println(name);
		
		//let's send instruction
		System.out.println(name + " please enter your age");
		
		//to read integer values, we use nextInt()
		int age=input.nextInt();
		
		System.out.println(name +" is "+age +" years old");
		
	}
}
