package com.bridgelabz.functionalprograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestDistance {

	@Test
	public void test1() {
		assertEquals(7.810249675906654, Utility.findDistance(6, 5),Math.E);
	}
	@Test
	public void test2() {
		assertEquals(0.0, Utility.findDistance(0, 0),Math.E);
	}

}
