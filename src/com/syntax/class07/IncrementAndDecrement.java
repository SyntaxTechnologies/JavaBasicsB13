package com.syntax.class07;

public class IncrementAndDecrement {
	
	public static void main(String[] args) {
		
		int x=10;
		
		x=x+1;
		
		x+=1;
		
		System.out.println(x); //12
		
		x++; //increments value of a variable by 1
		System.out.println(x); //13
		
		x--; //decrements value of a variable by 1
		System.out.println(x); //12
		
		//increment and decrement operators work only with variable
		
		// 10++; CE: Invalid argument to operation ++/--
		
		int num=100;
		num++;
		System.out.println(num);
	}
}
