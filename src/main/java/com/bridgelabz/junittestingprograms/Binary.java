package com.bridgelabz.junittestingprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class Binary {
	public static void main(String[] args) {

		System.out.println("Enter the Decimal Number");
		int decimal = InputUtility.getInt();
		int binary = Utility.toBinary(decimal);

		System.out.println(binary);
		
		int factSum = 0;
		for (int i = 0; i < String.valueOf(binary).length(); i++) {
			int pow = String.valueOf(binary).length() - 1 - i;
			if (String.valueOf(binary).charAt(i) == '1') {
				int fact = (int) Math.pow(2, pow);
				System.out.print(fact + " ");
				factSum = factSum + fact;
			}
		}
		System.out.println();
		System.out.println(binary + " conversion to Decimal : " + factSum);
		String newBinary = "" + binary;
		while (newBinary.length() % 4 != 0) {
			newBinary = "0" + newBinary;
		}
		System.out.println("4 Byte Padding Representation is : " + newBinary);
	}

	
}
