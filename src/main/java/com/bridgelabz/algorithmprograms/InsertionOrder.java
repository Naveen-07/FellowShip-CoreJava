package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class InsertionOrder {
	public static void main(String[] args) {
		System.out.println("Enter the size of an Array");
		int size = InputUtility.getInt();
		String[] arr = new String[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = InputUtility.getString();
		}
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(Utility.insertionOrder(arr)));
	}

}
