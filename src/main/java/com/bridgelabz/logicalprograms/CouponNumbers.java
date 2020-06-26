package com.bridgelabz.logicalprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class CouponNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the number of coupons Generate");
		int numberOfCoupons = InputUtility.getInt();
		System.out.println("Enter the Length of each coupon to Generate");
		int lengthOfCoupons = InputUtility.getInt();
		

		System.out.println(Utility.couponGenerate(numberOfCoupons, lengthOfCoupons));
	}
}
