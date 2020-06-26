package com.bridgelabz.functionalprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class Quadratic {
	public static void main(String[] args) {
		double a = 15, b = 68, c = 3;
		
		double delta = (b * b) - (4 * a * c);
		double root1 = Utility.quadratic( b, delta, a)[0];
		System.out.println("Root 1 of x : " + root1);
		double root2 = Utility.quadratic( b, delta, a)[1];
		System.out.println("Root 2 of x : " + root2);
	}
}
