package com.bridgelabz.junittestingprograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestBinary {

	@Test
	public void test1() {
		assertEquals(Utility.toBinary(163), 10100011);
	}
	@Test
	public void test2() {
		assertEquals(Utility.toBinary(0), 0);
	}
	@Test
	public void test3() {
		assertEquals(Utility.toBinary(-632), 0);
	}

}
