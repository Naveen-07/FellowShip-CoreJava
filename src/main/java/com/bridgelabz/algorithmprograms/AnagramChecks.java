package com.bridgelabz.algorithmprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class AnagramChecks {
	public static void main(String[] args) {
		System.out.println("Enter the first String to Check for Anagram");
		String s1 = InputUtility.getString();
		System.out.println("Enter the Second String to Check for Anagram");
		String s2 = InputUtility.getString();
		if (Utility.anagramCheck(s1, s2)) {
			System.out.println("2 Strings are Anagram");
		} else {
			System.out.println("2 Strings are Not an Anagram");
		}
	}
}
