package com.bridgelabz.behavioral.observerDesignPattern;

/**
 * runner class for the Observer design pattern
 * 
 * @author amresh kumar
 *
 */
public class ObserverRunner {
//main
	public static void main(String[] args) {
		// create subject
		Topics topic = new Topics();

		// create observers
		InterfaceObserver obj1 = new TopicSubscriber("Obj1");
		InterfaceObserver obj2 = new TopicSubscriber("Obj2");
		InterfaceObserver obj3 = new TopicSubscriber("Obj3");

		// register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		// attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);

		// check if any update is available
		obj1.update();

		// now send message to subject
		topic.postMessage("New Message");
	}
}
