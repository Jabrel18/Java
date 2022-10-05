package com.cognixia.jump.classandobjects;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
		
		// A basic class is known in java as a (POJO)
		// Plain Old Java Object, or also a
		// Bean (Java Bean).
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		// Attributes
		// The absence of a modifier, makes a field/method/constructor DEFAULT access
		protected String type;
		protected double weight;
		public static int count = 0;
		
		
	
		// Constructors
		public Animal(){
			this.type = "N/A";
			this.weight = 0.0;
			count++;
		}
		
		public Animal(String type, double weight){
			this.type = type;
			this.weight = weight;
			count++;
			
		}
	
		// Methods
		// Method syntax is (method signature):
		// access modifier, return type, name of the method, parameter set()
		public void makeSound(String sound) {
//			Animal methodAnimal = new Animal();
			
			System.out.println("Animal makes " + sound );
			
		}

		@Override
		public String toString() {
			return "Animal [type=" + type + ", weight=" + weight + "]";
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		// How to override "==" from checking the storage vs checking the contents

//		@Override
//		public int hashCode() {
//			return Objects.hash(type, weight);
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Animal other = (Animal) obj;
//			return Objects.equals(type, other.type)
//					&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
//		}
//		
		
	
		
}
