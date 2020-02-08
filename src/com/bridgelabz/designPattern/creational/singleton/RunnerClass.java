package com.bridgelabz.creational.singleton;
// runner class
public class RunnerClass extends DesignPatternSingletonEagerInitialization {
	public static void main(String[] args) {
		DesignPatternSingletonEagerInitialization object = DesignPatternSingletonEagerInitialization
				.getInstanceOfDesignPatternSingletonEagerInitialization();

		object.setDesignpatternsingletonMessege("Amresh");
		System.out.println(object.getDesignpatternsingletonMessege());

	}
}
