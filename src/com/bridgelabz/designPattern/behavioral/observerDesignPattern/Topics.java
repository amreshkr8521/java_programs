package com.bridgelabz.behavioral.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Topic class to contain all the topic required by the subject
 * 
 * @author amresh kumar
 *
 */
public class Topics implements InterfaceSubject {
	private String Message;
	private boolean changed;
	private final Object MUTEX = new Object();
	private List<InterfaceObserver> observers;

	/**
	 * to register the observer
	 * 
	 * @param obj InterfaceObserver
	 */
	@Override
	public void register(InterfaceObserver obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if (!observers.contains(obj))
				observers.add(obj);
		}

	}

	/**
	 * to unregister the observer
	 * 
	 * @param obj InterfaceObserver
	 */
	@Override
	public void unRegister(InterfaceObserver obj) {

		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	/**
	 * to notify the observer
	 */
	@Override
	public void notifyObserver() {
		List<InterfaceObserver> observersLocal = null;
		// synchronization is used to make sure any observer registered after message is
		// received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (InterfaceObserver obj : observersLocal) {
			obj.update();
		}

	}

	/**
	 * To update the observer
	 */
	@Override
	public Object getUpdate(InterfaceObserver observer) {

		return this.Message;
	}

	/**
	 * To get the msg and notify all the observer
	 * 
	 * @param msg
	 */
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.Message = msg;
		this.changed = true;
		notifyObserver();
	}

	public Topics() {
		this.observers = new ArrayList<>();
	}

}
