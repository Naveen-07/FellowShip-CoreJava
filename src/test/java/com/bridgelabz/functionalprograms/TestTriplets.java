package com.bridgelabz.functionalprograms;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.InvalidInputException;

public class TestTriplets {

	@Test(expected = InvalidInputException.class)
	public void test() {
		int[] triple = {};
		Utility.findTripletes(triple);
	}

}
