package com.syntax.class05;

public class LogicalAnd {
	
	public static void main(String[] args) {
		
		boolean job=false;
		double salary=75000;
		
		if(job && salary>=100000) {
			System.out.println("I am super duper happy");
		}
		
		System.out.println(" -------------------- ");
		
		boolean study=true;
		boolean homework=false;
		boolean practice=true;
		
		if(study && homework && practice) {
			
			System.out.println("You will succeed in the course");
		
		}else {
			System.out.println("You will struggle");
		}
		
		System.out.println(" -------------------- ");
		
		/*Write a program to find largest number among three numbers using nested if
		provided by a user (numbers must be distinct) */
		
		int num1 = 20;
		int num2 = 10;
		int num3 = 22;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The largest number is " + num3);
		
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
		
		}
		
	}
}
