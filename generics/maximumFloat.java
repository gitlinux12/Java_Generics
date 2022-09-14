package com.generics;

public class maximumFloat {
		public static double maxOfFloat(double x, double y, double z) {
			if (x > y && x > z) {
				return x;
			} else if (y > z) {
				return y;
			} else {
				return z;
			}
		}

		public static void main(String[] args) {
			System.out.println("Test case 2.1");
			System.out.println("Maximum  among 3 no. is = " + maxOfFloat(6.9, 4.8, 5.9));
			System.out.println("Test case 2.2");
			System.out.println("Maximum  among 3 no. is = " + maxOfFloat(3.2, 8.5, 2.8));
			System.out.println("Test case 2.3");
			System.out.println("Maximum  among 3 no. is = " + maxOfFloat(3.9, 4.8, 9.9));
		}
}
