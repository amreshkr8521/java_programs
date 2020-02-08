package com.bridgelabz.DataStructure;

import com.bridgelabz.dataStructure.utility.Node;

/**
 * DeQueue is an abstract data structure, somewhat similar to Stacks.
 *   Unlike stacks, a queue is open at both its ends. In this both end are used to insert data and remove data
 *   
 * @author amresh kumar
 * @since  26-11-2019
 * @param  <T> Generic
 * 
 */
public class Dequeue<T> {
Node head;



public Dequeue() //constructor to initializing the DeQueue object
{
	head=null;
}

/******************************************************************************************
 * 
 * To insert at the front of the Dequeue 
 * 
 * @param  item
 * @return void
 * 
 * ****************************************************************************************
 */
public void addFront(T item) {
	Node node = new Node(item);
	if (head == null) {
		head = node;
	} else {
		node.next = head;
		head = node;
	}
}

/******************************************************************************************
 * 
 * To add element at the rear of the dequeue
 * 
 * @param  item
 * @return void
 * 
 * ****************************************************************************************
 */
public void addRear(T item) {
	Node node = new Node(item);
	Node current = head;
	if (head == null) {
		head = node;
	} else {
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
		node = current;
	}
}
/*******************************************************************************************************
 * To remove the element from the rear side
 * 
 * @param 	null
 * @return  void
 * 
 * *****************************************************************************************************
 */
public T removeRear() {
	Node current = head;
	T data = null;
	Node prev = null;
	while (current.next != null) {
		prev = current;
		current = current.next;
	}
	data = (T) current.data;
	prev.next = null;
	return data;
}


/*******************************************************************************************************
 * To remove the element from the front side
 * 
 * @param 	null
 * @return  void
 * 
 * *****************************************************************************************************
 */
public T removeFront() {
	T data = (T) head.data;
	head = head.next;
	return data;
}
	
	/***************************************************************************************************
	 * 
	 * To check if dequeue is empty or not
	 * 
	 * @param  null
	 * @return void
	 * 
	 * *************************************************************************************************
	 */
public boolean isEmpty() {
	if(size()==0)
		return false; //return false if there is any element
	else
		return true; // return true if there is no element
}
	
	
	/**********************************
	 * to find the size of the list
	 * 
	 * @return integer
	 * 
	 * ********************************
	 */
public int size() {
	Node current = head;
	int size = 0;
	if (head == null) {
		System.out.println("Queue is empty");
	} else {
		while (current != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	return -1;
}
	
	
	/**************************************************************************************************
	 * 
	 * TO show all the elements in the Dequeue
	 * 
	 * @param  null
	 * @return void
	 * 
	 * ***********************************************************************************************
	 */
	public void show() {
		Node currentNode=head;
		while(currentNode.next!=null) // loop to traverse till next is null
		{
			
			System.out.print(currentNode.data+" "); //will show the elements 
			currentNode=currentNode.next;
		}
		System.out.print(currentNode.data+"\n"); //will show the last element its next is null
	}


}
