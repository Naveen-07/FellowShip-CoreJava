package com.bridgelabz.junittestingprograms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InputMissMatchException;

public class TestSqrt {

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = InputMissMatchException.class)
	public void test1() {
		assertEquals(Utility.sqrt(0), 0,Math.E);
	}
	@Test
	public void test2() {
		assertEquals(Utility.sqrt(12), 3.464101615137755,Math.E);
	}

}
