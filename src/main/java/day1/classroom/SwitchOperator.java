package day1.classroom;

import java.util.Scanner;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=2,b=3;
		System.out.println("Enter the operation to be performed");
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);

		// Declare a String variable with input as operations (Tip:
		String operations=in.nextLine();

		// Initiate switch case for operations
		switch (operations) {
		case "add":
        System.out.println("Added Value:"+ (a+b));		
        break;
		case "sub":
	        System.out.println("Subtracted Value:"+ (a-b));		
	        break;
		case "mul":
	        System.out.println("Multiplied Value:"+ (a*b));		
	        break;
	        
		case "div":
	        System.out.println("Division Value:"+ (a/b));		
	        break;

		default:
		
	        System.out.println("Operation doesnot Exists");		
	      
			break;
		}
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
