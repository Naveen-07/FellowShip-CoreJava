package com.bridgelabz.algorithmprograms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InputMissMatchException;

public class TestAnagramChecks {

	@Test
	public void test1() {

	assertEquals(Utility.anagramCheck("heart", "earth"), true);
	}
	@Test(expected = InputMissMatchException.class)
	public void test2() {
		
		assertEquals(Utility.anagramCheck("silentce", "listen"), true);
	}
	@Test
	public void test3() {
		
		assertTrue(Utility.anagramCheck("silent", "listen"));
	}

}
