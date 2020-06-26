package com.bridgelabz.junittestingprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("Enter Temperature Extension with celsius or fahrenheits");
		float temp = InputUtility.getFloat();
		char key = InputUtility.getString().toLowerCase().charAt(0);
		System.out.println(Utility.temperatureConvertion(temp,key));
	}
	
}
