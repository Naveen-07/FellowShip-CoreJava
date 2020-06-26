package com.bridgelabz.basiccoreprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.CustomisedException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class FlipCoin {
	public static void main(String[] args) throws CustomisedException 
	{

		LogUtility.setLogger("LeapYear");
		Logger logger = LogUtility.getLogger();
		System.setProperty("fname",
				"F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\basiccoreprograms\\FlipCoin.java");
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("Enter a : " + logger.getName());
		logger.warn("may cause InputMisMatchException  : ");
		System.out.println("Enter the Number of flips");
		int numberOfFlips = 0;
		
		numberOfFlips = InputUtility.getInt();
		
		if (numberOfFlips <= 0) {
			System.out.println("Number Of Flips Should be positive Number");
			return;
		}
		
		Utility.coinFlips(numberOfFlips);
		
	}
}
