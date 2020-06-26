package com.bridgelabz.basiccoreprograms;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InvalidInputException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class PrimeFactorization {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		//LogUtility.setLogger("LeapYear");
		//Logger logger = LogUtility.getLogger();
	//	System.setProperty("fname",
			//	"F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\basiccoreprograms\\PrimeFactorization.java");
		//PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		//logger.info("Enter a : " + logger.getName());
		//logger.warn("may cause errors : ");
		int number = InputUtility.getInt();
		if (number <= 0) {
			throw new InvalidInputException("Input value should not be Zero");
		}
		System.out.println(Arrays.toString(Utility.primeFactorization(number)));
	}
}
