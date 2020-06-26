package com.bridgelabz.algorithmprograms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageModify {

	private static final String str = "Hello <<name>>, We have your full name as\r\n"
			+ "<<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know\r\n"
			+ "in case of any clarification Thank you BridgeLabz XX/XX/XXXX.";

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");

			System.out.println("Enter Name : ");
			String name = sc.nextLine();
			String nameP = "<<name>>";
			Pattern p = Pattern.compile(nameP);
			Matcher m = p.matcher(str);
			String msg = m.replaceAll(name);

			System.out.println("Enter Last Name : ");
			String fullName = sc.next();
			String fullNameP = "<<full name>>";
			Pattern p1 = Pattern.compile(fullNameP);
			Matcher m1 = p1.matcher(msg);
			msg = m1.replaceAll(name + " " + fullName);

			System.out.println("Enter Mobile Number : ");
			String contactNumber = sc.next();
			String contactNumberP = "xxxxxxxxxx";
			Pattern p2 = Pattern.compile(contactNumberP);
			Matcher m2 = p2.matcher(msg);
			msg = m2.replaceAll(contactNumber);

			Pattern p3 = Pattern.compile("XX/XX/XXXX");
			Matcher m3 = p3.matcher(msg);
			msg = m3.replaceAll(format.format(date));

			System.out.println("Msg: " + msg);
		}
	}
}
