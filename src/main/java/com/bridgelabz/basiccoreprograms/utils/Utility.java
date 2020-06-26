package com.bridgelabz.basiccoreprograms.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.bridgelabz.userdefinedexception.CustomisedException;
import com.bridgelabz.userdefinedexception.InputMissMatchException;
import com.bridgelabz.userdefinedexception.InvalidInputException;
import com.bridgelabz.utils.InputUtility;

public class Utility {

	/**
	 * method to find coinFlips that gives Heads or tails
	 * 
	 * @param numberOfFlips
	 *
	 */
	public static void coinFlips(int numberOfFlips) {
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < numberOfFlips; i++) {
			if (Math.random() < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}
		System.out.println("Percentage of Heads is " + (heads / (float) numberOfFlips) * 100);
		System.out.println("Percentage of Tails is " + (tails / (float) numberOfFlips) * 100);

	}

	/**
	 * method to find powerOf2 that gives 0 sum
	 * 
	 * @param N
	 * @throws CustomizedException
	 *
	 */
	public static int[] powerOf2(int N) {
		int[] power = new int[N + 1];
		int i = 0;
		if (N <= 0) {
			throw new CustomisedException("Integer value should not be zero");
		}

		while (Math.pow(2, N) >= Math.pow(2, i)) {
			power[i] = (int) Math.pow(2, i);
			i++;
		}
		return power;
	}

	public static double harmonicNumber(int Nth) {
		double harmonic = 0;
		for (int i = 1; i <= Nth; i++) {
			harmonic += (1 / (double) i);
		}
		return harmonic;
	}

	public static Boolean leapYearChecks(int year) {
		Logger logger = Logger.getLogger(Utility.class.getName());
		if (String.valueOf(year).length() != 4) {
			logger.info("a 4 digit and Non-Negetive year");
			System.out.println("Enter a 4 digit and Non-Negetive year only");
			return false;
		} else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a Leap Year");
			return true;
		} else {
			System.out.println(year + " Not a Leap Year");
			return false;
		}
	}

	public static String stringReplace(String name) {

		String template = "Hello <<username>>, how are you?";
		boolean flag = Pattern.matches("^[a-zA-Z]{3,15}$", name);
		String newTemplete = null;
		if (flag) {
			newTemplete = template.replaceAll("<<username>>", name);
			return newTemplete;
		} else {
			return "Invaild Input";
		}
	}

	public static double findDistance(int x, int y) {
		double distance = Math.pow((x * x) + (y * y), 0.5);
		return distance;
	}

	public static double[] quadratic(double b, double delta, double a) {
		double[] roots = new double[2];
		roots[0] = ((-b + Math.sqrt(delta)) / (2 * a));
		roots[1] = ((-b - Math.sqrt(delta)) / (2 * a));
		return roots;
	}

	public static Object[] primeFactorization(int number) {
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * while (number % 2 == 0) { list.add(2); number = number / 2; }
		 */
		for (int i = 2; i <= Math.sqrt(number); i++) {
			while (number % i == 0) {
				if (isPrime(i))
					list.add(i);
				number = number / i;
			}
		}
		if (number > 2) {
			list.add(number);
		}
		Object[] factors = list.toArray();
		return factors;
	}

	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = number; i > 1; i--) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}

	static ArrayList<String> arrlist = new ArrayList<String>();

	public static ArrayList<String> recursivePermutation(String s1, String s2) {
		if (s1.length() == 0) {
			arrlist.add(s2);
		}
		for (int i = 0; i < s1.length(); i++) {

			String s3 = s2 + s1.charAt(i);
			String s4 = s1.substring(0, i) + s1.substring(i + 1);
			recursivePermutation(s4, s3);
		}
		return arrlist;
	}

	public static String[] iterativePermutation(String s1) {
		List<String> li = new ArrayList<String>();
		li.add(String.valueOf(s1.charAt(0)));

		for (int i = 1; i < s1.length(); i++) { // abc
			for (int j = li.size() - 1; j >= 0; j--) { // list
				String s2 = li.remove(j);
				for (int k = 0; k <= s2.length(); k++) { // remaining
					li.add(s2.substring(0, k) + s1.charAt(i) + s2.substring(k));
				}
			}
		}
		String[] arr = new String[li.size()];
		li.toArray(arr);
		return arr;
	}

	public static int factorial(int number) {
		int value = number;
		while (number > 1) {
			value *= number - 1;
			number--;
		}
		return value;
	}

	public static boolean permutationChecks(String s1) {

		String[] s2 = iterativePermutation(s1);
		Arrays.sort(s2);

		ArrayList<String> arrayList = recursivePermutation(s1, "");
		String[] sarr = new String[arrayList.size()];
		arrayList.toArray(sarr);
		Arrays.sort(sarr);

		int count = 0;
		for (int i = 0; i < sarr.length; i++) {
			if (s2[i].equals(sarr[i])) {
				count++;
			}
		}

		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(sarr));
		if (count == factorial(s1.length())) {
			System.out.println("Recursive and Iterative permutations are Equal");
			return true;
		}
		return false;
	}

	public static boolean anagramCheck(String s1, String s2) {
		int count = 0;
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch1.length; i++) { // status = Arrays.equals(ch1, ch2);
				for (int j = i; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
						count++;
						break;
					}
				}
			}
			if (s1.length() == count) {
				return true;
			}
			else {
				return false;
			}	}
		else {
			throw new InputMissMatchException("Input Strings are Not in Same Lengths");
		}
	}

	public static int binary(String[] arr, int beg, int end, String search) {
		if (beg <= end) {
			int mid = (beg + end) / 2;
			if (arr[mid].equals(search)) {
				return mid + 1;
			} else if (search.compareTo(arr[mid]) > 0) {
				return binary(arr, mid + 1, end, search);
			} else {
				return binary(arr, beg, mid - 1, search);
			}
		}
		return -1;
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		return arr;
	}

	public static String[] insertionOrder(String[] arr) {

		System.out.println();
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
			System.out.println();
		}
		return arr;

	}

	private static void merge(String arr[], int beg, int mid, int end) {

		int left = mid - beg + 1;
		int right = end - mid;

		String LeftArray[] = new String[left];
		String RightArray[] = new String[right];

		for (int i = 0; i < left; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < right; ++j)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;
		while (i < left && j < right) {
			if (RightArray[j].compareToIgnoreCase(LeftArray[i]) > 0) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < left) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < right) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	public static void sort(String arr[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	public static ArrayList<Integer> findPrimeRange(int range, ArrayList<Integer> list) {

		for (int i = 2; i < range; i++) {
			int count = 0;
			for (int j = i; j > 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				list.add(i);
			}
		}
		return list;
	}

	/*
	 * public static void primeAnagramPolindrome(int range, ArrayList<Integer> list)
	 * { list = findPrimeRange(range, list); for (int i = 0; i < list.size(); i++) {
	 * for (int j = 0; j < list.size(); j++) { if (list.get(i) == list.get(j)) {
	 * 
	 * } } }
	 * 
	 * }
	 */

	public static int[][] insertIntoArray(int rows, int columns) {
		System.out.println("Enter the Array Elements");
		if (rows == 0 || columns == 0) {
			throw new CustomisedException("Array column or row size Should not be zero");
		}
		int[][] array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = InputUtility.getInt();
			}
		}
		return array;
	}

	public static int findTripletes(int[] array) {
		int count = 0;
		if (array.length <= 0) {
			throw new InvalidInputException("Input mismatched re-enter Again");
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] != array[j] && array[j] != array[k] && array[i] != array[k]
							&& array[i] + array[j] + array[k] == 0) {
						count++;
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
					}
				}
			}
		}
		return count;
	}

	public static double findWindChill(int temperature, int windSpeed) {
		Random random = new Random();
		if (temperature > 50) {
			temperature = random.nextInt(51);
			System.out.println("New Assumed Temperature : " + temperature);
		}
		if (windSpeed > 120 || windSpeed < 3) {

			windSpeed = random.nextInt(118) + 3;
			System.out.println("New Assumed Wind Speed : " + windSpeed);
		}
		double windChill = 35.74 + (0.6215 * temperature)
				+ ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}

	public static int toBinary(int decimal) {
		int binary = 0;
		int i = 1;
		if (decimal > 0) {
			while (decimal != 0) {
				binary += (decimal % 2) * i;
				decimal /= 2;
				i *= 10;
			}
			return binary;
		} else
			return 0;
	}

	public static int toDecimal(String nibbleSwap) {

		int sum = 0;
		int deciConvert = 0;
		for (int i = 0; i < nibbleSwap.length(); i++) {
			int pow = nibbleSwap.length() - 1 - i;
			if (nibbleSwap.charAt(i) == '1') {
				deciConvert = (int) Math.pow(2, pow);
				System.out.print(deciConvert + " ");
				sum += deciConvert;
			}
		}
		System.out.println();
		System.out.println(nibbleSwap + " Binary to Decimal convertion is : " + sum);
		return sum;
	}

	public static double monthlyPayment(double P, double Y, double R) {
		if (P > 0 && Y > 0 && R >= 0) {
			double r = R / (double) (12 * 100);
			double payment = (P * r) / (1 - Math.pow((1 + r), -(12 * Y)));
			return payment;
		} else {
			throw new InputMissMatchException("Input Should not be a negative Value");
		}
	}

	public static double sqrt(double c) {
		if (c > 0) {
			double t = c;
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > epsilon * t) {
				t = ((c / t) + t) / 2;
			}
			return t;
		} else {
			throw new InputMissMatchException("Input should not be a Zero or Negative value");
		}
	}

	public static String temperatureConvertion(float temp, char key) {
		String result = "";
		switch (key) {
		case 'c':
			result = ((temp * (9 / (float) 5)) + 32 + " fahrenheits");
			break;
		case 'f':
			result = ((temp - 32) * (5 / (float) 9)) + " celsius";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		return result;
	}

	public static int vendingMachine(int amount, int[] notes, int total, int i) {
		if (amount == 0) {
			System.out.println("Total number of notes are : " + total);
			return -1;
		} else {
			if (amount >= notes[i]) {
				int count = amount / notes[i];
				amount %= notes[i];
				total += count;
				System.out.println(notes[i] + " Notes is ==> " + count);
			}
			i++;
			return vendingMachine(amount, notes, total, i);
		}
	}

	public static int getDay(int d, int month, int y) {
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		monthDays[1] = ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) ? 29 : 28;
		if ((12 >= month) && (monthDays[month - 1] >= d)) {
			int y0 = y - (14 - month) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = month + 12 * ((14 - month) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		} else {
			return -1;
		}
	}

	public static ArrayList<String> couponGenerate(int numberOfCoupons, int lengthOfCoupon) {

		if (numberOfCoupons <= 0 && lengthOfCoupon <= 0) {
			throw new InvalidInputException("Input Should Not be Zero or Negetive Integer");
		}
		ArrayList<String> list = new ArrayList<String>();
		char[] charArray = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890".toCharArray();
		for (int i = 0; i < numberOfCoupons; i++) {

			String coupon = "";

			for (int j = 0; j < lengthOfCoupon; j++) {
				coupon = coupon + charArray[(int) (Math.random() * charArray.length)];
			}
			list.add(coupon);
		}
		return list;
	}

	public static void gamblingSimulate(int stake, int goal, int trials) {
		int bets;
		int wins = bets = 0;
		for (int i = 0; i < trials; i++) {
			int cash = stake;
			while (cash < goal && cash > 0) {
				bets++;
				if (Math.random() > 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				wins++;
			}
		}
		System.out.println(wins + " out of : " + trials);
		System.out.println("Percent of game wons : " + (wins * 100) / trials);
		System.out.println("Average bets is : " + (1.0 * bets) / trials);
	}

	public static String checkWinner(String[] board, String turn) {

		for (int i = 0; i < 8; i++) {
			String line = null;
			switch (i) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[4] + board[8];
				break;
			case 4:
				line = board[2] + board[4] + board[6];
				break;
			case 5:
				line = board[0] + board[3] + board[6];
				break;
			case 6:
				line = board[2] + board[5] + board[8];
				break;
			case 7:
				line = board[1] + board[4] + board[7];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
				break;
			} else if (i == 8) {
				return "draw";
			}
		}
		System.out.println(turn + " 's turn :enter the slot number to place " + turn + " in:");
		return null;
	}

	public static void printBoard(String[] board, String turn) {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}
}
