package com.bridgelabz.creational.singleton;
/**
 * Synchronized singleton pattern
 * 
 * @author amresh kumar
 *
 */
public class DesignPatternSingletonDoubleSyncronized {
	private static DesignPatternSingletonDoubleSyncronized designPatternSingletonDoubleSyncronized_Instance;
	private static String messege = "";

	public static String getDesignpatternsingletonMessege() {
		return messege;
	}

	public static void setDesignpatternsingletonMessege(String MessegeSend) {
		messege = MessegeSend;
	}

	private DesignPatternSingletonDoubleSyncronized() {
	}

	public static synchronized DesignPatternSingletonDoubleSyncronized getDesignPatternSingletonDoubleSyncronizedInstance() {
		if (designPatternSingletonDoubleSyncronized_Instance == null) {
			synchronized (DesignPatternSingletonDoubleSyncronized.class) {
				if (designPatternSingletonDoubleSyncronized_Instance == null)
					designPatternSingletonDoubleSyncronized_Instance = new DesignPatternSingletonDoubleSyncronized();
			}
		}
		return designPatternSingletonDoubleSyncronized_Instance;
	}
}
