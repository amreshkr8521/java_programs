package com.bridgelabz.creational.singleton;

/**
 * To make singleton class using the BILL PUGH method
 * 
 * @author Amresh Kuumar
 * @since 9-12-2019
 * @version 1.0
 *
 */
public class DesignPatternSingletonBillPugh {
	private static String messege = "";

	/**
	 * To get the data of the messege
	 * 
	 * @param null
	 * @return String
	 */
	public static String getDesignpatternsingletonMessege() {
		return messege;
	}

	/**
	 * To set the value of messege
	 * 
	 * @param MessegeSend --> String
	 * @return void
	 */
	public static void setDesignpatternsingletonMessege(String MessegeSend) {
		messege = MessegeSend;
	}

	private DesignPatternSingletonBillPugh() {
	}

	/**
	 * To create the instance of the DesignPatternSingletonBillPugh using the inner
	 * class
	 *
	 */
	private static class InnerClassOfDesignPatternSingletonBillPugh {
		private static final DesignPatternSingletonBillPugh DESIGN_PATTERN_SINGLETON_BILL_PUGH_Instance = new DesignPatternSingletonBillPugh();
	}

	/**
	 * To return the instance of the singleton class DesignPatternSingletonBillPugh
	 * 
	 * @param null
	 * @return DesignPatternSingletonBillPugh
	 *
	 */
	public static DesignPatternSingletonBillPugh getDesignPatternSingletonBillPughInstance() {
		return InnerClassOfDesignPatternSingletonBillPugh.DESIGN_PATTERN_SINGLETON_BILL_PUGH_Instance;
	}
}
