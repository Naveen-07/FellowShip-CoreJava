package com.bridgelabz.utils;

import java.util.Scanner;

public class InputUtility {
	private final static Scanner scan = new Scanner(System.in);

	/**
	 *static method to take Integer from user.
	 *@return Integer value which is given by user
     */
	public static int getInt() {
		return scan.nextInt();
	}
	/**
	 *static method to take double from user.
	 *@return double value which is given by user
     */
	public static double getDouble() {
		return scan.nextDouble();
	}
	/**
	 *static method to take String from user.
	 *@return String value which is given by user
     */
	public static String getString() {
		return scan.next();
	}
	/**
	 *static method to take char from user.
	 *@return char value which is given by user
     */
	public static char getChar() {
		return scan.next().charAt(0);
	}
	/**
	 *static method to take float from user.
	 *@return float value which is given by user
     */
	public static float getFloat() {

		return scan.nextFloat();
	}
}
