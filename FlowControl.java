package com.cognixia.jump.javabasics;

import java.util.Scanner;

// This class will demonstrate Flow Control using:
// Conditionals - if and Switch
// Loops - for, while, doWhile
public class FlowControl {

	public static void main(String[] args) {
		
//		// Setup some user input, for variable evaluation:
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt user
//		System.out.println("Please enter an integer: ");
//		
//		// collect input
//		int readInt = input.nextInt();
//		
//		//Conditionals:
//			// If
//			// check even numbers
//			// % = Modulus, which gets the remainder from division of the 2 numbers
//			if (readInt % 2 == 0) {
//				System.out.println("Your input of: " + readInt + " was an even number.");
//				if (readInt > 0) {
//					System.out.println("And its's positive");
//					}
//				else System.out.println("And it's negative.");
//				}
//			else if (readInt == 5) {
//				System.out.println("You chose my favorite number!");
//			}
//			
//			else {
//					System.out.println("Your input of: " + readInt + " was an odd number");
//					if (readInt > 0) {
//						System.out.println("And its's positive");
//						}
//					else System.out.println("And it's negative.");
//					};
//			
//		
//			// Switch Case - works for checking if the integer in this case, is equal to the below
//			// options
//	
//			switch(readInt) {
//			case 1: System.out.println("You are withdrawing money.");
//			break;
//			case 2: System.out.println("You are depositing money.");
//			break;
//			case 3: System.out.println("Your balance is: " + 1_000_000);
//			
//			}
//	/*	
//			// The same above logic, but with if statements
//			if(readInt == 1) {
//				System.out.println("You are withdrawing money.");
//			}
//			else if(readInt == 2) { 
//				System.out.println("You are depositing money."); 
//				
//			}
//			else if(readInt == 3){
//				System.out.println("Your balance is: " + 1_000_000);
//				
//			}
//	*/			
//			// Example utility of cascading in Switch(no breaks);
//			// The code is free falling
//			char in = 'b';
//			switch(in) {
//			case 'b':
//			case 'B':
//				System.out.println("The letter is B");
//			}
//			
//			
			// Loops!
			// While Loop		
			int counter = 0;
			while(counter <= 10) {
				System.out.println(counter);
				//this is what the below does:  counter = counter + 1;
				if(counter == 7) {
					System.out.println("special number!");
					counter+=2;
					break;
				}
				counter++;
			}
			
			// do while loop
			counter = 0;
			do {
				System.out.println("in the do while " + counter);
				counter++;
			}while(counter < 11);
			
			// For Loop
			// a local variable that defines a starting point, an ending condition of the loop
			// and how we traverse the loop (change the counter).
			System.out.println("\nFor Loop example:\n");
			for(int i = 10; i > 0; i--) {
				System.out.println(i);
			}
			
			// Nested Loop
			System.out.println("\nNested Loop example:\n ");
			for(int i = 1; i <= 10; i++) {
				for(int j = 1; j < 3; j++) {
					System.out.println("i = " + i + "\tj = " + j);
				}
			}
		
		
		
		
		
	}

}
