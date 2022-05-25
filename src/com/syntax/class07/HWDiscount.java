package com.syntax.class07;

import java.util.Scanner;

public class HWDiscount {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale? Please enter yes or no");
		String sale = input.next();
		
		double price;
		double discount = 0.00, salePrice = 0.00, discountPrice=0.0;;
	
		if (sale.equalsIgnoreCase("yes")) {
			
			System.out.println("Which product do you wish to purchase?");
			String product = input.next();
			
			System.out.println("Please enter the price of the product");
			price = input.nextDouble();
			
			if (price < 20) {
				discount = 10;
			} else if (price >= 20 && price <= 100) {
				discount = 20;
			} else if (price >= 101 && price <= 500) {
				discount = 30;
			} else {
				discount = 50;
			}
			
			discountPrice=price * discount/100;
			salePrice = price - discountPrice;
			
			System.out.println("After a discount of $" + discountPrice + " the price of the item reduced from " + price
					+ " to " + salePrice);
		} else {
			System.out.println("There is no sale, so you are not going shopping");
		}

	}
}
