package com.bridgelabz.creational.singleton;

/**
 * Singleton Static Block Initialization
 * 
 * @author amresh kumar
 *
 */
public class DesignPatternSingletonStaticBlockInitialization {

	private static DesignPatternSingletonStaticBlockInitialization DesignPatternSingletonStaticBlockInitialization_Instance;
	private static String Messege = "";

	private DesignPatternSingletonStaticBlockInitialization() {
	}

	static {
		try {
			DesignPatternSingletonStaticBlockInitialization_Instance = new DesignPatternSingletonStaticBlockInitialization();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static DesignPatternSingletonStaticBlockInitialization getInstanceOfDesignPatternSingletonStaticBlockInitializatin() {
		return DesignPatternSingletonStaticBlockInitialization_Instance;
	}

	public static String getDesignPatternSingletonStaticBlockInitializationMessege() {
		return Messege;
	}

	public static void setDesignPatternSingletonStaticBlockInitializationMessege(String ReadMessege) {
		Messege = ReadMessege;
	}

}
