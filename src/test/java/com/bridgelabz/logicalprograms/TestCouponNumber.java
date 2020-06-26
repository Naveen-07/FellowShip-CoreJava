package com.bridgelabz.logicalprograms;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InvalidInputException;

import junit.framework.Assert;

public class TestCouponNumber {

	@Test(expected = InvalidInputException.class)
	public void test1() {
		Utility.couponGenerate(0, 0);
	}
	@Test
	public void test2() {
		Assert.assertEquals(9, Utility.couponGenerate(9, 8).size());
	}
}
