package com.bridgelabz.functionalprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class Distance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x Value");
		int x = InputUtility.getInt();
		System.out.println("Enter the y Value");
		int y = InputUtility.getInt();
		try {
			System.out.println("Distance is : " + Utility.findDistance(x, y));
			scan.close();
		} catch (InputMismatchException e) {
			System.err.println("Enter the interger value Only");
		}
	}

}
