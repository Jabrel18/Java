package com.cognixia.jump.collectionsgenerics;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsGenericDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Showcasing Generics Method and VarArgs from Calculator
//		System.out.println(Calculator.sum(5, 2));
//		System.out.println(Calculator.sum(5.5, 2.7));
//		System.out.println(Calculator.sum(3, 5.2));
//		
//		
//		System.out.println(Calculator.sum(5, 2.7f, 6l, 9.9d));

		
		
		// For all collections
			// CRUD
			// Create Data
			// Read Data
			// Update Data
			// Delete Data
			// *looping through the collection
		
		// List
		List<String> colors  = new ArrayList<>();
		
		colors.add("red");
		colors.add("blue"); 
		System.out.println(colors);
		colors.add(0, "yellow");
		System.out.println(colors);
		
		System.out.println(colors.get(2));
		
		// using create and remove (delete) to update
		colors.remove(2);
//		System.out.println(colors.get(2));
		colors.add(2, "orange");
		System.out.println(colors.get(2));
		
		// ArrayList vs LinkedList
		
		
		
		// Set 
		Set<Integer> ints = new HashSet<>();
		
		Set<String> setColors = new HashSet<>(colors);
		
		String search = "Maroon";
		String found = "";
		setColors.add("Maroon");
		for (String str : setColors) {
			if(str.equals(search)) found = str;
		}
		
		System.out.println(found);
		
		System.out.println("\nIterator example: ");
		Iterator<String> iter = setColors.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		setColors.remove("Maroon");
		
		System.out.println(setColors);
		
		
		// Queue
			// Polymorphism with Interfaces
		List<String> listColors = new LinkedList<>(setColors);
		LinkedList<String> llColors = new LinkedList<String>(listColors);
		Queue<String> qColors = new LinkedList<>(llColors);
		Deque<String> dqColors = new LinkedList<>(llColors);
		
		
		System.out.println("\nLinked List prints: ");
		System.out.println(listColors.get(1));
		System.out.println(llColors.getLast());
		
		System.out.println(qColors.poll());
		System.out.println(qColors.poll());
		
		// poll retrieve and remove the front value of the queue (polllast is back)
		// peek just want to view the data in front, but not remove
		
		qColors.add("Purple");
		System.out.println(qColors);
		
		
		
		// Map
		// part of xCollections Framework, but not stemming from the Collection Interface
		System.out.println("\nMaps: ");
		Map<String, Double> coins = new HashMap<>();
		
		coins.put("Quarter", 0.25);
		coins.put("Dime", 0.10);
		coins.put("Nickel", 0.05);
		coins.put("Penny", 0.01);
		
		
		System.out.println(coins);
		
		System.out.println(coins.get("Dollar"));
		
		//cannot directly loop through a map
		for(String key : coins.keySet()) {
			// looping through the set of keys (not the map) and showing values
//			System.out.println(coins.get(key));
			System.out.println(key);
		}
		
		
		
	}

}
