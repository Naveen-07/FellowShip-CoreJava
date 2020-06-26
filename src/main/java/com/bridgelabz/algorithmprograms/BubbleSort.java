package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter the Size of an Array");
		int size = InputUtility.getInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements");
		
		for (int i = arr.length-1; i >= 0; i--){
			arr[i] = InputUtility.getInt();
			
			System.out.println(Arrays.toString(Utility.bubbleSort(arr)));
		}
	}

	
}
