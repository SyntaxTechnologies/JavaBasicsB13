package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {

		// continue - skips current execution/iteration
		// when java executes continue -> 
		// go back to the beginning of the loop, 
		// so rest of the code inside loop body
		// will be skipped/ignored 

		for (int i = 1; i <= 5; i++) {

			if (i == 2) {
				continue;
			}
			
			System.out.print(i + " ");
			System.out.println("Hello");
			System.out.println("We are going on break soon ))))");
		}
		
		// print numbers from 1 to 10 except number 5 and 7
		
		for(int i=1; i<=10; i++) {
			
			if (i==5 || i==7) {
				continue;
			}
			
			System.out.print(i+"  ");//1  2  3  4  6  8  9  10 
		}

	}
}
