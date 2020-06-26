package com.bridgelabz.basiccoreprograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestLeapYear {

	
	@Test
	public void test1() {
		boolean boolean1 = Utility.leapYearChecks(2020);
		assertEquals("error",true, boolean1);
	}
	@Test
	public void test2() {
		boolean boolean1 = Utility.leapYearChecks(-2020);
		assertEquals("error",false, boolean1);
	}
	@Test
	public void test3() {
		boolean boolean1 = Utility.leapYearChecks(0);
		assertEquals("error",false, boolean1);
	}
}
