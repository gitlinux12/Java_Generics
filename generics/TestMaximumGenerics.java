package com.generics;

public class TestMaximumGenerics {
	public static Integer maxInteger( int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} else if (y > z) {
			return y;
		} else {
			return z;
		}
	}
	public static void main(String[] args) {
		System.out.println("Maximum among 3 No.= "+maxInteger(5,2,3));
		
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum among 3 No : "+maxInteger(5, 2, 1));
		
		System.out.println("Test case 1.2");
		// Test Case 1.2 maximum number at second position 
		
		System.out.println("Maximum among 3 No : "+maxInteger(1, 6, 1));
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at third position 
		
		System.out.println("Maximum among 3 No : "+maxInteger(1, 1, 6));
		
		
	}

}
