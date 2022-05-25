package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// part a
		String name="Zameer";
		String lastName="Noori";
		char grade='B';
		String city="Falls Church";
		String state="VA";
		long phone=76344763733l;
		System.out.println("My name is "+name+" and "+" my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in "+city+" and "+state);
		System.out.println("And my phone number is "+phone);
		
		//part b
		grade='A';
		state="Odesskaya Oblast'";
		phone=38063403056l;
		city="Odessa";
		
		System.out.println("My name is "+name+" "
				+ "and I moved to new city "+ city+" and new state"+state+". "
						+ "My new phone number is "+phone);
	}
}
