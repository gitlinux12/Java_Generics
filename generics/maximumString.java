package com.generics;

public class maximumString {
	
	public static String maximumString(String x, String y, String z) {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			return x;
		} else if (y.compareTo(z) > 0) {
			return y;
		} else {
			return z;
		}
	}
	public static void main(String[] args) {
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum string at first position 
		System.out.println("Maximum of : "+maximumString("apple", "banana ","peach"));
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of : "+maximumString("apple", "peach ","banana"));
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of : "+maximumString("apple", "banana ","peach"));
		
	}

}
