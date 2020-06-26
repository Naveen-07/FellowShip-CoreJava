package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class RangeInPrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the Range of Prime Numbers");
		int range = InputUtility.getInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(Utility.findPrimeRange(range,list));
		
	}
}
