package com.bridgelabz.basiccoreprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InvalidInputException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class HarmonicNumber {
	public static void main(String[] args) {

		System.out.println("enter the Nth Value");
		LogUtility.setLogger("LeapYear");
		Logger logger = LogUtility.getLogger();
		System.setProperty("fname",
				"F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\basiccoreprograms\\HarmonicNumber.java");
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("Enter a : " + logger.getName());
		logger.warn("may cause InputMissMatchException : ");
		int Nth = InputUtility.getInt();
		if (Nth<= 0) {
			throw new InvalidInputException("Input Should Not be Zero or Negetive Integer");
		}
		System.out.println(Utility.harmonicNumber(Nth));
	}
}
