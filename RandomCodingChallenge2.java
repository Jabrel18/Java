package com.cognixia.jump.codingproblems;

import java.util.Scanner;

public class RandomCodingChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int x; 
        int y;
		
        //Input Numbers
		System.out.println("Input 1st Number for x: ");
		x = input1.nextInt();
		System.out.println("Input 2nd Number for y: ");
		y = input2.nextInt();
        
		// math to create logic 
		x = x + y;		
        y = x - y;
        x = x - y;
        
        // Print output
        System.out.println("After Change:" + " x = " + x + ", y = " + y);	
		
        input1.close();
        input2.close();
	}

	
	
}
