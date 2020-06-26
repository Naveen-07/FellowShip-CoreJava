package com.bridgelabz.basiccoreprograms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

import junit.framework.TestCase;

public class TestPowerOf2 extends TestCase {

	@Test
	public static void test1() {
		int[] expectedArray = { 1, 2, 4, 8, 16, 32 };
		assertArrayEquals(expectedArray, Utility.powerOf2(5));
	}

	@Test
	public static void test2() {
		int[] expectedArray = { 1, 2, 4, 8, 16, 32 };
		int[] actual = Utility.powerOf2(5);
		assertEquals(expectedArray.length, actual.length);
	}

	@Test(timeout = 1000)
	public void testForException() 
	{
		Utility.powerOf2(253);
	}
}
