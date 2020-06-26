package com.bridgelabz.functionalprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class TripletesZero {
	public static void main(String[] args) {

		System.out.println("enter the size of an array");
		int size = InputUtility.getInt();
		int[] array = new int[size];
		System.out.println("Enter Array Elemets");
		for (int i = 0; i < array.length; i++) {
			array[i] = InputUtility.getInt();
		}
		Utility.findTripletes(array);
	}
}
