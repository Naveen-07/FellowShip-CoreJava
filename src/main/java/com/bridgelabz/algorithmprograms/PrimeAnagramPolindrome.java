package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;

import com.bridgelabz.userdefinedexception.InvalidInputException;
import com.bridgelabz.utils.InputUtility;

public class PrimeAnagramPolindrome extends RangeInPrimeNumbers {
	public static void main(String[] args) {
		int range = InputUtility.getInt();
		if (range <= 0) {
			throw new InvalidInputException("Input Should Not be Zero or Negetive Integer");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Utility.primeAnagramPolindrome(range,list);
	}
	
}
