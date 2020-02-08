package com.bridgelabz.DataStructure;

import com.bridgelabz.dataStructure.utility.InputUtility;
import com.bridgelabz.dataStructure.utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) {
		System.out.println("Enter the expression : ");
		if (Utility.balancedParanthesischeck(InputUtility.nextLine()))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
