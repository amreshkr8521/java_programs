package com.bridgelabz.basic;

import com.brdgelabz.utility.BasicProgramUtility;
import com.brdgelabz.utility.InputUtility;


/**
 * To replace the <<UserName>> with the user given name if user given name is
 * greater than 2
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class StringReplace {

	public static void main(String[] args) {
		String str = "Hello <<UserName>>, How are You?";
		System.out.println(str);
		System.out.println("Enter your name");
		System.out.println(BasicProgramUtility.stringReplace(str, InputUtility.next()));
	}
}
