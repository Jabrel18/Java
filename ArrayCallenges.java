package com.cognixia.jump.codingproblems;

public class ArrayCallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean condition;
//		boolean condition2;
		int[] Numbers1 = { 1, 3, 6, 0};
		int[] Numbers2 = { 1, 3, 5, 0};
		int[] Numbers3 = { 1, 3, 5, 0, 7};
//		condition2 = challenge2(Numbers1,Numbers2);
		condition = challenge1(Numbers1,Numbers2);
		if (condition == true) 
			System.out.println("Challenge is true");
		else if (condition != true) 
			System.out.println("Challenge not true");
//		if (condition2 == true)
//			System.out.println("Challenge2 is true");
//		else if (condition2 != true)
//			System.out.println("Challenge2 not true");
		
		
	}
			
	// method with solution

		static boolean challenge1(int[] Numbers1, int[] Numbers2) {
		int count = 0;
		int length= 0;
		//have 2 arrays to compare
		if (Numbers1.length==Numbers2.length) length = Numbers1.length;
		else return false;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(Numbers1[i] == Numbers2[j]) {
					count++;
					}
			}		
		}
			
		//  System.out.println(count);
		if (count==length) return true;
		else return false;
			
			
		}
		
//		static boolean challenge2(int[] Numbers2, int[] Numbers3) {
//			int count = 0;
//			int length= 0;
//			
//			for(int i = 0; i <= length; i++) {
//				if Numbers2.length
//			}
//		}
				


	}

	

		