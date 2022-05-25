package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		num=num+100;
		System.out.println(num);//200
		
		num=num+50;
		System.out.println(num); //250
		
		num+=100; // num=num+100
		num-=10; //num=num-10;
		System.out.println(num); //340
		
		num/=10;
		num*=2;
		System.out.println(num);//68
		
		num%=2;
		System.out.println(num); //0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a);//30
		
		a+=b+c;//a=a+b+c
		System.out.println(a);//80
		
		a*=10;
		System.out.println(a);//800
		
		/*
		 * Declare variable cakePiece=11 
		 * and divide the value of that variable 
		 * between 4 people using shorthand operator 
		 */
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		/*
		 * Declare variable cake=25 and 
		 * divide cake between 7 people . 
		 * Using shorthand operator 
		 * found out how many pieces of cake 
		 * left after it was distributed equally among 7 people 
		 */
		int cake=25;
		System.out.println(cake/7);
		cake%=7;
		System.out.println(cake);

	}
}
