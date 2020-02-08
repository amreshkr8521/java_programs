package com.bridgelabz.behavioral.observerDesignPattern;
/**
 * Service class for the topics
 * 
 * @author amresh kumar
 *
 */
public interface InterfaceSubject {
	public void register(InterfaceObserver observer);

	public void unRegister(InterfaceObserver observer);

	public void notifyObserver();

	public Object getUpdate(InterfaceObserver observer);
}
