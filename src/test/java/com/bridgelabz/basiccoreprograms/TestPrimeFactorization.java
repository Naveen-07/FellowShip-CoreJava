package com.bridgelabz.basiccoreprograms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestPrimeFactorization {

	@Test
	public void test1() {
		Object[] expected = {3,3,13,139};
		assertArrayEquals(expected, Utility.primeFactorization(16263));
	}
	@Test
	public void test2() {
		Object[] expected = {};
		assertArrayEquals(expected, Utility.primeFactorization(0));
	}

}
