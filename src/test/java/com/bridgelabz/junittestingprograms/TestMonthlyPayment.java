package com.bridgelabz.junittestingprograms;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InputMissMatchException;

import junit.framework.Assert;

public class TestMonthlyPayment {

	@Test
	public void test1() {
		Assert.assertEquals(Utility.monthlyPayment(5000, 1, 100), 674.9788494141565);
	}
	@Test(expected = InputMissMatchException.class)
	public void test2() {
		Assert.assertEquals(Utility.monthlyPayment(0, 1, 100), 0);
	}

}

