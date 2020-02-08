package com.blab.amresh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Basic program test
 * 
 * @author amresh kumar
 *
 */
class BasicProgramUtilityTest {
	@Test
	public void HarmonicNumbersTest() {
		// test for positive number
		assertEquals(2.2833335399627686, BasicProgramUtility.harmonicNumbers(5));
		assertEquals(2.9289684295654297, BasicProgramUtility.harmonicNumbers(10));

		// test for negetive number
		assertEquals(-2.2833335399627686, BasicProgramUtility.harmonicNumbers(-5));
		assertEquals(-2.9289684295654297, BasicProgramUtility.harmonicNumbers(-10));
	}

	@Test
	public void isLeapYearTest() {
		// test when leap year is expected
		assertTrue(BasicProgramUtility.isLeapYear(2020));
		assertTrue(BasicProgramUtility.isLeapYear(2000));
		assertTrue(BasicProgramUtility.isLeapYear(2016));

		// test when leap year is not expected
		assertFalse(BasicProgramUtility.isLeapYear(2027));
		assertFalse(BasicProgramUtility.isLeapYear(2001));
		assertFalse(BasicProgramUtility.isLeapYear(2011));
	}

	@Test
	public void stringReplaceTest() {
		// test when string is replaced expected

		assertEquals("Amresh", BasicProgramUtility.stringReplace("<<UserName>>", "Amresh"));
		assertEquals("Rahul", BasicProgramUtility.stringReplace("<<UserName>>", "Rahul"));

		// test when string is not replaced as expected

		assertEquals("am has less character", BasicProgramUtility.stringReplace("<<UserName>>", "am"));
		assertEquals("r has less character", BasicProgramUtility.stringReplace("<<UserName>>", "r"));

	}
}
