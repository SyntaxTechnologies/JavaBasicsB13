package com.syntax.class08;

public class BreakKeyword {
	
	public static void main(String[] args) {
		
		//break - breaks block of code
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Hello");
			
			if(i==2) {
				break;
			}
		}
		
		boolean summer=true;
		int temp=95;
		
		while(summer) {
			
			System.out.println("It is hot");
			
			if(temp<70) {
				System.out.println("It is not hot anymore");
				break;
			}
			
			temp-=10;
		}
		
		
	}
}
