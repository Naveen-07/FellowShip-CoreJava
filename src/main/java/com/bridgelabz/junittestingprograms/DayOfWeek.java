package com.bridgelabz.junittestingprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class DayOfWeek {
	public static void main(String[] args) {
		LogUtility.setLogger("DayOfWeek");
		Logger logger = LogUtility.getLogger();
		System.setProperty("fname",
				"F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\junittestingprograms\\DayOfWeek.java");
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("Enter a : " + logger.getName());
		logger.warn("may cause errors : ");
		System.out.println("Enter the Day");
		int d = InputUtility.getInt();
		System.out.println("Enter the Month");
		int m = InputUtility.getInt();
		System.out.println("Enter the Year");
		int y = InputUtility.getInt();

		System.out.println("Day is : " + Utility.getDay(d, m, y));

	}
}
