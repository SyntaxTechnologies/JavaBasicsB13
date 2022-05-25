package com.syntax.class06;

import java.util.Scanner;

public class RecapHw {

	public static void main(String[] args) {

		boolean checkboxSelected = false;

		if (!checkboxSelected) {
			System.out.println("Click on checkbox");
		}

		System.out.println(" --------------------------------------  ");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years");
		int years = input.nextInt();
		
		if (years >= 5) {
			
				System.out.println("You are eligible for the bonus");
				System.out.println("Enter annual salary");
				int salary = input.nextInt();
				
				if (salary >=50000) {
					System.out.println("You are eligible for 5000 bonus");
				} else {
					System.out.println("You are eligible for 3000 bonus");
				}
		} else {
			System.out.println("Sorry you are not eligible for bonus");
		}

		System.out.println(" --------------------------------------  ");
		
		
		System.out.println("Current time");
		int time=input.nextInt();
		
		if (time>=1 && time<= 11) {
			System.out.println("Morning");
		
		}else if (time>=12 && time<=15) {
			System.out.println("Afternoon");
		
		}else if (time>=16 && time<=20) {
			System.out.println("Evening");
		
		}else if (time>=21 && time <=24){
			System.out.println("Night");
		
		}else {
			System.out.println("Invalid time entered");
		}
		
		System.out.println(" -----------------------------  ");
		
		System.out.println("What month were you born in!");
		
		String month=input.next();
		
		if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
			System.out.println("You were born in Spring");
		
		else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August"))
			System.out.println("You were born in Summer");
		
		else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November"))
			System.out.println("You were born in Autumn");
		
		else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February"))
			System.out.println("You were born in Winter");
		
	}
}
