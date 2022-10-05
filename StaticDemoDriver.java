package com.cognixia.jump.javabasics;

public class StaticDemoDriver {

	public static void main(String[] args) {
	//	StaticDemoClass demo = new StaticDemoClass();
	
		// Static Methods can be run right off a class, no object 
		StaticDemoClass.staticMethod();
		StaticDemoClass demo = new StaticDemoClass();
		StaticDemoClass.staticMethod();
		demo.instanceMethod();
//		StaticDemoClass demo2 = new StaticDemoClass();
//		demo2.instanceMethod();
		
		{
//			System.out.println("Driver's anonymous block");
		}
		
	}
}
