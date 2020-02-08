package com.bridgelabz.creational.singleton;

/**
 * LazyInitializtion singleton design pattern
 * 
 * @author amresh kumar
 *
 */
public class DesignPatternSingletonLazyInitializtion {
	private static DesignPatternSingletonEagerInitialization designPatternSingletonEagerInitialization_Instance;
	private static String messege = "";

	private DesignPatternSingletonLazyInitializtion() {
	}

	public static DesignPatternSingletonEagerInitialization getInstanceOfDesignPatternSingletonLazyInitialization() {
		if (designPatternSingletonEagerInitialization_Instance == null)
			designPatternSingletonEagerInitialization_Instance = new DesignPatternSingletonEagerInitialization();

		return designPatternSingletonEagerInitialization_Instance;
	}

	public static String getDesignpatternsingletonMessege() {
		return messege;
	}

	public static void setDesignpatternsingletonMessege(String MessegeSend) {
		messege = MessegeSend;
	}

}
