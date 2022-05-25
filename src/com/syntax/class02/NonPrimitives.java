package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg";
		String lastName="Smith";
		long phone=1234567890l;
		//xxx-xxx-xxxx
		String phoneNumber="123-456-7890";
		String address="123 Washington str";
		
		int age =30;
		String city="Miami";
		city="Los Angeles";
		//shortcut for printing
		// type syso +ctrl +space --> hit enter
		
		/* we can use +  -> works as concatenation operator
		 *              to attach String to String
		 *              to attach String to int
		 *              to attach String to double 
		 *              to any other type 
		 */
		System.out.println(name+" "+lastName);//Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old
		
		String words="years old";
		System.out.println(name+" is "+age+" "+words);
		
		/*
		 * Rules for identifiers
		 * 1. no space
		 * 2. no keywords
		 * 3. cannot start with numbers (numbers can be used after the letter)
		   4. cannot have with special character(except _, $)
		 */
		
		//String break="Hello"; error
		//int 1number=10; error
		int number1=10;
		
		//int num%=20; error
		double $price=3.99;
		float f_=2.09f;
		
		/*
		 * Naming Conventions:
		 * follow camel casing
		 * variable/methods names should start with lowercase and then follow camel casing
		 * class names should start with uppercase
		 */
		
		String MyCity="Tysons";
		
		
	}

}
