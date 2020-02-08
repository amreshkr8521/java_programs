package com.bridgelabz.behavioral.observerDesignPattern;
/**
 * 
 * @author amresh kumar
 *
 */
public interface InterfaceObserver {
	public void update();

	public void setSubject(InterfaceSubject subject);
}
