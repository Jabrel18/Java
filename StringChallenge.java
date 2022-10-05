package com.cognixia.jump.codingproblems;

public class StringChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String str= "Academics";
				// Declare and Initiate
		        String backstr = " ";
		        char ch;
		        
		        // Print initial Word
		      System.out.println("Original word: " + str); 
		        
		      for (int i=0; i<str.length(); i++)
		      {
		    	  // Grabs each character
		        ch= str.charAt(i); 
		         // adds the character to the front
		        backstr= ch+backstr; 
		      }
		      	// Prints reverse word
		      System.out.println("Reversed word: "+ backstr);
		      
		      
		   }
		
	
	
	
	}      
		      
		      
		      
		      	// Part 3:
//		      	
//		      String ary1[] = str;
//		      int count = 9;
//		      
//		      
//		      for (int i=0; i<count; i++) {
//		    	  if ()
//		      }
//		      
		      
		 


