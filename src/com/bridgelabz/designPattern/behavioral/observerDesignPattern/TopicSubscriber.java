package com.bridgelabz.behavioral.observerDesignPattern;

/**
 * To contain all the subscriber who subscribe to the subjects
 * 
 * @author amresh
 * @version 1.0
 */
public class TopicSubscriber implements InterfaceObserver {
	private String name = "";
	private InterfaceSubject topic;

	/**
	 * To update the topic
	 */
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new message");
		} else
			System.out.println(name + ":: Consuming message::" + msg);

	}

	/**
	 * To set the subject to the list
	 * 
	 * @param subject InterfaceSubject
	 */
	@Override
	public void setSubject(InterfaceSubject subject) {
		this.topic = subject;

	}

	/**
	 * To name the topic of the subject
	 * 
	 * @param topic
	 */
	public TopicSubscriber(String topic) {
		this.name = topic;
	}

}
