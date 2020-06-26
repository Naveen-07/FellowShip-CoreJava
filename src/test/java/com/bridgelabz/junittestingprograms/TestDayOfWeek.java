package com.bridgelabz.junittestingprograms;

import static org.junit.Assert.*;
import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestDayOfWeek {

	@Test
	public void test1() {
		assertEquals(Utility.getDay(17, 3, 2020), 2);
	}
	@Test
	public void test2() {
		assertEquals(Utility.getDay(32, 3, 2020), -1);
	}
	@Test
	public void test3() {
		assertEquals(Utility.getDay(30, 13, 2020), -1);
	}

}
