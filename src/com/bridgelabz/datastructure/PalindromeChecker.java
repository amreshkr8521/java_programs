package com.bridgelabz.DataStructure;

import com.bridgelabz.dataStructure.utility.InputUtility;
import com.bridgelabz.dataStructure.utility.Utility;

/**
 * To check if the user given String is Palindrome or not
 * 
 * @author amresh
 *
 */
public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.println("Enter the String you want to check for Palindrome");
		if (Utility.isPalindrome(InputUtility.next()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
