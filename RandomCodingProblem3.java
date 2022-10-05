package com.cognixia.jump.codingproblems;

import java.util.Scanner;

public class RandomCodingProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
        String word;
        String palindrome = "";


            System.out.print("Enter a word: ");
            word = scr.nextLine().toUpperCase();
            int length = word.length();
            for (int i = length - 1; i >= 0; i--) {
                palindrome = palindrome + word.charAt(i);
            }

            if (word.equals(palindrome)) {
                System.out.printf("The word " + palindrome + " is the same as " + word + "? ", true);
            } else {
                System.out.println(false);
                System.out.println("This is not a palindrome word: " + word);
            }

        scr.close();
		
	}

}
