package com.blab.amresh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * functional programming test case
 * 
 * @author amresh kumar
 *
 */
class FunctionalUtilityTest {

	@Test
	public void windChillTest() {
		// test when wind is above 3 and less than 120 and temperature is less than 50
		assertEquals(-4.545216784228067, FunctionalUtility.windChill(10, 10));
		assertEquals(7.8440382357107765, FunctionalUtility.windChill(20, 10));

		// test when wind is less than 3
		assertEquals(0.0, FunctionalUtility.windChill(10, 1));
		assertEquals(0.0, FunctionalUtility.windChill(20, 2));
	}
}
