package com.bridgelabz.junittestingprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class Sqrt {
	public static void main(String[] args) {
		System.out.println("Enter the Non-Negative number");
		double c = InputUtility.getDouble();
		System.out.println(Utility.sqrt(c));
	}
}
