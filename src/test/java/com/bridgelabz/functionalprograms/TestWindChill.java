package com.bridgelabz.functionalprograms;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

import junit.framework.Assert;

public class TestWindChill {

	@Test
	public void test() {
		Assert.assertEquals(2.6458642113188304, Utility.findWindChill(25, 63), Math.E);
	}

	@Test
	public void test1() {
		Assert.assertNotSame(0.0, Utility.findWindChill(0, 0));
	}
}
