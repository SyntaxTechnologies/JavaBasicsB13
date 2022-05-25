package com.syntax.class02;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		//to create a variable we need 2 things: datatype & name
		
		/* 1 way to create a variable
		 * dataType name = value */
		//declare a variable temperature and we initialized it
		int temperature=60;
		
		/* 2 way that is done in 2 steps
		 * create a variable (dataType and name )
		 * assign the value */
		
		int sum; //create a variable or declare a variable
		sum=30; // assign the value
		System.out.println(sum);//30
		sum=50; // reassign the value
		
		int num1, num2, num3; //create 3 variables of int type
		num1=10; // assign the value
		num2=20; // assign the value
		num3=30; // assign the value
		
		System.out.println(sum);//50
	}
}
