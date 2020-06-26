package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class MergeSortListOfStrings {



	public static void main(String args[]) {
		String arr[] = { "first", "second", "third", "forth", "value" ,"arukala"};
		Utility.sort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
		
	}
}
