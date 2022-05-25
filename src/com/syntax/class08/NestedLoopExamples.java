package com.syntax.class08;

public class NestedLoopExamples {
	
	public static void main(String[] args) {
		
		for(int a=0; a<=9; a++) {
			
			for (int b=0; b<=9; b++) {
				
				for (int c=0; c<=9; c++) {
					
					System.out.println(a+" "+b+" "+c);
				}
			}
		}
	}
}
