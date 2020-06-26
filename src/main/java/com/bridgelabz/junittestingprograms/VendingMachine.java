package com.bridgelabz.junittestingprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class VendingMachine {

	public static void main(String[] args) {
		LogUtility.setLogger("VendingMachine");
		Logger logger = LogUtility.getLogger();
		System.setProperty("fname","F:\\Jspiders-workspace\\bridgelabz\\src\\main\\java\\com\\bridgelabz\\junittestingprograms\\VendingMachine.java");
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("Enter a : "+logger.getName());
		logger.warn("may cause errors : ");
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int i = 0, total = 0;
		System.out.println("enter the amount");
		
		int amount = InputUtility.getInt();
		if (amount <=0) {
			logger.error("Amount should not be Zero");
		}
		Utility.vendingMachine(amount, notes, total,i);
		
	}
}
