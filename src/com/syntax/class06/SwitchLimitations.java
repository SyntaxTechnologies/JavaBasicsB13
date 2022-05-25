package com.syntax.class06;

public class SwitchLimitations {
	
	public static void main(String[] args) {
		
		/* switch can work with byte, short, int, char, String
		 * 
		 * switch has a datatype limitations
		 * 
		 * switch cannot work with double, float, long, boolean
		 */
		
		double price=10;
		
		/*switch(price) { ->CE: Cannot switch on a value of type double.
		
		}
		*/
		
		boolean hungry=true;
		
		/*switch(hungry) { -> CE: Cannot switch on a value of type boolean. 
		
		}
		*/
		
		/*
		 * switch has a operators limitations
		 * cannot use logical operators inside switch
		 * cannot use relational operators
		 */
		
		char choice='Y';
		String meaning;
		
		/*switch(choice) {
		
		case 'Y' || 'y': --> CE: cannot use ||
			meaning="Yes";
			break;
		}
		*/
		
		int day=5;
		
		/*
		 * switch(day) {
			case >5:
			}
		 */
	}
}
