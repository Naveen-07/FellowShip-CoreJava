package com.bridgelabz.basiccoreprograms;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InvalidInputException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class PowerOf2 {
	public static void main(String[] args) {
		System.out.println("enter the Power value N");
		LogUtility.setLogger("LeapYear");
		Logger logger = LogUtility.getLogger();
		System.setProperty("fname",
				"F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\basiccoreprograms\\PowerOf2.java");
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("Enter a power of N : " + logger.getName());
		logger.warn("may cause InputMismatchException : ");
		int N = InputUtility.getInt();
		
		if (N <= 0) {
			throw new InvalidInputException("Input Should Not be Zero or Negetive Integer");
		}
		System.out.println((int) Math.pow(2, N));
		int[] array = Utility.powerOf2(N);
		System.out.println(Arrays.toString(array));
		

	}
}
