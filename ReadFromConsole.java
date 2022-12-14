package com.cognixia.jump.javabasics;

import java.util.Scanner;

// This demo will use a Java Standard Library data type, Scanner, to read user input from the 
// Key board
// Note - Scanner is Not a primitive data type, but rather a Class / Object.
public class ReadFromConsole {

	public static void main(String[] args) {
		
		//This program takes in user input, and will print it
		
		// step 1 - set up, the user input with a Scanner
		Scanner input = new Scanner(System.in);
		
		// step 2 - prompt user with instructions
		System.out.println("Enter a sentence: ");
		
		// step 3 - read the user input and store as needed
		// set the data type for the expected input, then collect the input with the appropriate scanner
		String readInput = input.nextLine();
		
		// step 4 - print the input to the console
		System.out.println(readInput);
				
	
	
	
	}
			
}


