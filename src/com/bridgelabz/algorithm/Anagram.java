package com.bridgelabz.algorithm;

import com.brdgelabz.utility.AlgorithmUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * to check if two Strings are anagarm or not
 * 
 * @author amresh kumar
 *
 */
public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter the two string you want to check for anagram");
		if (AlgorithmUtility.isAnagram(InputUtility.next(), InputUtility.next()))
			System.out.println("both are anagram");
		else
			System.out.println("Not anagram");
	}
}
