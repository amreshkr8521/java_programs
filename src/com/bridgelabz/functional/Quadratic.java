package com.bridgelabz.functional;

import com.brdgelabz.utility.FunctionalUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * To calculate roots of the expression aX*X + b*X +c
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Quadratic expression is 'a*x^2 + a*x +c'");
		System.out.println("Enter the value for a, b and c");
		FunctionalUtility.roots(InputUtility.nextDouble(), InputUtility.nextDouble(), InputUtility.nextDouble());
	}
}
