package com.blab.amresh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * test cases for the algoritm methods
 * 
 * @author amresh kumar
 *
 */
class AlgorithmTest {

	@Test
	public void binarySearchIntigerTest() {
		int array[] = { 1, 2, 3, 4, 5, 23, 45 };
		// test for index 6
		assertEquals(6, AlgorithmUtility.binarySearchIntiger(array, 45, array.length, 0));
		// test for index 0
		assertEquals(0, AlgorithmUtility.binarySearchIntiger(array, 1, array.length, 0));

	}

	@Test
	public void isAnagramTest() {
		String string1 = "abc";
		String string2 = "cba";
		assertTrue(AlgorithmUtility.isAnagram(string1, string2));

		// test when they are not anagram
		assertFalse(AlgorithmUtility.isAnagram("def", string2));

	}

	@Test
	public void isPrimeTest() {
		// test when number is prime and expected is true
		assertTrue(AlgorithmUtility.isPrime(13));
		assertTrue(AlgorithmUtility.isPrime(23));

		// Test when number is not prime and expected is false
		assertFalse(AlgorithmUtility.isPrime(132));
		assertFalse(AlgorithmUtility.isPrime(22));

	}
}
