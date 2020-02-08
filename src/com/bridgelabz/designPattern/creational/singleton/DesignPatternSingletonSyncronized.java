package com.bridgelabz.creational.singleton;

/**
 * Singleton Syncronized design pattern
 * 
 * @author amresh kumar
 *
 */
public class DesignPatternSingletonSyncronized {
	private static DesignPatternSingletonSyncronized designPatternSingletonSyncronized_Instance;
	private static String messege = "";

	private DesignPatternSingletonSyncronized() {
	}

	public static synchronized DesignPatternSingletonSyncronized getDesignPatternSingletonSyncronizedInstance() {
		if (designPatternSingletonSyncronized_Instance == null) {
			designPatternSingletonSyncronized_Instance = new DesignPatternSingletonSyncronized();
		}
		return designPatternSingletonSyncronized_Instance;
	}

	public static String getDesignpatternsingletonMessege() {
		return messege;
	}

	public static void setDesignpatternsingletonMessege(String MessegeSend) {
		messege = MessegeSend;
	}
}
