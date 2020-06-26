package com.bridgelabz.junittestingprograms;

import static org.junit.Assert.*;
import org.junit.Test;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TestTemperatureConversion {


	@Test
	public void test1() {
		assertEquals(Utility.temperatureConvertion(36, 'c'), "96.799995 fahrenheits");
	}
	@Test
	public void test2() {
		assertEquals(Utility.temperatureConvertion(0, 'f'), "-17.777779 celsius");
	}
	@Test
	public void test3() {
		assertEquals(Utility.temperatureConvertion(-36, 'c'), "-32.799995 fahrenheits");
	}

}
