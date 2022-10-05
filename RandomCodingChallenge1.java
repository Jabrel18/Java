package com.cognixia.jump.codingproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RandomCodingChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//user input index
		int index = 0;
		System.out.println("Input index (0-4): ");
		Scanner input = new Scanner(System.in);
		boolean invalidInput = false;
		trySearchName(index, invalidInput, input);
			
		
//		Set<String> setClass = new HashSet<>(class1);
//		
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter Student Name" );
//		String found = "";
//		for (String str : setClass) {
//			if(str.equals(input.next())) found = str;
//			System.out.println(found);
//			
//				
//		}	
//		
//		input.close();
		
	
		
	}

	public static void trySearchName(int i, boolean invalidInput, Scanner input)  {
		List<String> class1  = new ArrayList<>();
		
//		System.out.println("Homeroom Class: ");
		class1.add("Joe ");
		class1.add("Alvin ");
		class1.add("Saquon ");
		class1.add("Nick ");
		class1.add("Derrick ");
//		System.out.println(class1);
		
	try {
		i = input.nextInt();
		String a = class1.get(i);
		System.out.println(a);
		invalidInput = false;
	
	}
	
	catch (Exception e) {
		System.out.println("wrong input! ");
		
	}
	
	
	
		


	}
}
