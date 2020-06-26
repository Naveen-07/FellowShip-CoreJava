package com.bridgelabz.junittestingprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class MonthlyPayment {
	public static void main(String[] args) {
		System.out.println("Enter the principal loan amount");
		int principalLoan = InputUtility.getInt();
		System.out.println("Enter the Years to pay off");
		int yearsOff = InputUtility.getInt();
		System.out.println("Enter the per cent interest compounded monthly");
		int interestRate = InputUtility.getInt();
		System.out.println(Utility.monthlyPayment(principalLoan, yearsOff, interestRate));
	}
}
