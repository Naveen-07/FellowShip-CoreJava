package com.bridgelabz.basiccoreprograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestHarmonic {

	@Test
	public void test1() {
		double value = Utility.harmonicNumber(-22);
		assertEquals("error", 0.0, value, Math.E);
	}

	@Test
	public void test2() {
		double value = Utility.harmonicNumber(0);
		assertEquals("error", 0.0, value, Math.E);
	}

	@Test
	public void test3() {
		double value = Utility.harmonicNumber(22);
		assertEquals("error", 3.690813250217275, value, Math.E);
	}

}
