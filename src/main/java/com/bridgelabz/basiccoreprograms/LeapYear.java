package com.bridgelabz.basiccoreprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class LeapYear {

	public static void main(String[] args) {
		LogUtility.setLogger("LeapYear");
		Logger logger = LogUtility.getLogger();
		System.setProperty("fname","F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\basiccoreprograms\\LeapYear.java");
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("Enter a : "+logger.getName());
		logger.warn("may cause errors : ");
		int year = InputUtility.getInt();
		Utility.leapYearChecks(year);
	}
}
