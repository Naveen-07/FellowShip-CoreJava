package com.bridgelabz.basiccoreprograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestStringReplace {

	@Test
	public void test1() {
		assertEquals("Invaild Input", Utility.stringReplace("naveen12"));
	}
	@Test
	public void test2() {
		assertEquals("Hello programmer, how are you?", Utility.stringReplace("programmer"));
	}
	
}
