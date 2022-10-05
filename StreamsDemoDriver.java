package com.cognixia.jump.streamapi;

import java.util.Arrays;

public class StreamsDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] primitive = {2,4,6,8,10,12,16};
		
		// In need to convert the above array of ints to an array of objects
		Integer[] newArray = new Integer[primitive.length];
		int i = 0;
		for (int value : primitive) {
		    newArray[i++] = Integer.valueOf(value);
		}
		
		//let's do the above, but with streams:
		Integer[] intObjs = Arrays.stream(primitive)
				.boxed()
				.toArray()(Integer[]::new);
		
		System.out.println(Arrays.toString(primitive));
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(intObjs));
		
		List<Integer> numbers = Arrays.asList(integers);
		
		System.out.println("\nFor Each example:");
		numbers.forEach(System.out::println);
		
		numbers.forEach(n -> System.out.println)
		
		
	}

}
