package com.bridgelabz.functionalprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter the Temperature");
		int temperature = InputUtility.getInt();
		System.out.println("Enter the WindSpeed");
		int windSpeed = InputUtility.getInt();
		
		System.out.println(Utility.findWindChill(temperature,windSpeed));
	}
}
