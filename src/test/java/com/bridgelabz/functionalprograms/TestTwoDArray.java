package com.bridgelabz.functionalprograms;


import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.userdefinedexception.CustomisedException;

public class TestTwoDArray {

	@Test(expected = CustomisedException.class)
	public void test() {
		Utility.insertIntoArray(0, 0);
	}

}
