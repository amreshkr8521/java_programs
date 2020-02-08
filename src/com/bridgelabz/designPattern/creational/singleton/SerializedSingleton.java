package com.bridgelabz.creational.singleton;

import java.io.Serializable;

/**
 * Serialized Singleton pattern and to make it Serialized Serializable interface
 * is implemented
 * 
 * @author amresh kumar
 *
 */
public class SerializedSingleton implements Serializable {

	private static final long Id = -546835164;

	private SerializedSingleton() {
	}

	private static class InnerHelper {
		private static SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getSerializedSingleton() {
		return InnerHelper.instance;
	}
}
