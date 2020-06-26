package com.bridgelabz.functionalprograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestQuadratic {

	@Test
	public void test1() {
		assertEquals(-0.044555558333472335, Utility.quadratic(68, 4444.0, 15)[0],Math.E);
	}

}
