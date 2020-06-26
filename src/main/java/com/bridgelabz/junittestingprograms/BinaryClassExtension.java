package com.bridgelabz.junittestingprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class BinaryClassExtension extends Binary {
	public static void main(String[] args) {
		System.out.println("Enter the Decimal Number");
		int decimal = InputUtility.getInt();
		int binary = Utility.toBinary(decimal);
		System.out.println("Binary No. is : " + binary);

		String newBinary = "" + binary;
		while (String.valueOf(newBinary).length() % 4 != 0) {
			newBinary = "0" + newBinary;
		}
		System.out.println("4 byte Binary Padding : " + binary);
		String nibbleSwap = "";
		for (int i = 1; i <= 4; i++) {
			if (i > 1) {
				newBinary = nibbleSwap;
				nibbleSwap = "";
			}
			for (int j = 0; j < newBinary.length() - 1; j++) {
				nibbleSwap = nibbleSwap + newBinary.charAt(j);
			}
			nibbleSwap = newBinary.charAt(newBinary.length() - 1) + nibbleSwap;
		}
		System.out.println("Nibble Swapped : " + nibbleSwap);

		Utility.toDecimal(nibbleSwap);

	}

}
