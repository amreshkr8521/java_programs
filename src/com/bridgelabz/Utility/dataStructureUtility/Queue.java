package com.bridgelabz.dataStructure.utility;

import java.util.NoSuchElementException;

import com.bridgelabz.dataStructure.utility.Node;

/************************************************
 * 
 * Queue is an abstract data structure, somewhat similar to Stacks. Unlike
 * stacks, a queue is open at both its ends. One end is always used to insert
 * data (enqueue) and the other is used to remove data (dequeue). Queue follows
 * First-In-First-Out methodology, i.e., the data item stored first will be
 * accessed first.
 * 
 * @author amresh kumar
 *
 * @param <T> Generic type class
 * @since 26-11-2019
 * 
 */
public class Queue<T> {
	Node head;

	public Queue() // constructor to initializing the Queue object
	{
		head = null;

	}

	/*********************************************************************
	 * To insert the element at the last of the queue
	 * 
	 * @param item --> generic type
	 * @return void
	 * 
	 ********************************************************************
	 */

	public void enqueue(T item) {
		Node node = new Node();// creating new node
		node.data = item; // inserting data to new node
		node.next = null;

		if (head == null)

			head = node;

		else {
			Node currentNode = head;
			while (currentNode.next != null) // traversing till last node

				currentNode = currentNode.next;

			currentNode.next = node; // after the last node is found than the new node is assigned
		}
	}

	/************************************************************************************************
	 * 
	 * To delete the front element from the queue
	 * 
	 * @param null
	 * @return void
	 * 
	 *         **********************************************************************************************
	 */

	public void dequeue() {
		Node node = head;
		head = node.next;
	}

	/*************************************************************************************************
	 * 
	 * To check if queue is empty or not
	 * 
	 * @return boolean
	 * 
	 *         ***********************************************************************************************
	 */
	public boolean isEmpty() {
		if (head == null)
			return true; // return false if there is any element
		else
			return false; // return true if there is no element
	}

	/**************************************************************************************************
	 * 
	 * To return the size of the queue
	 * 
	 * @return integer
	 * 
	 *         ************************************************************************************************
	 */
	public int size() {
		Node node = head; // creating the node object to store the head
		int count = 0;
		if (head == null) {
			return -1;
		} else {
			while (node != null) // traverse all the element
			{

				node = node.next;
				count++;
			}
			return count; // return the size
		}
	}

	/**************************************************************************************************
	 * 
	 * TO show all the elements in the queue
	 * 
	 * @param null
	 * @return void
	 * 
	 *         ***********************************************************************************************
	 */
	public void show() {
		Node currentNode = head;
		while (currentNode.next != null) // loop to traverse till next is null
		{

			System.out.print(currentNode.data + " "); // will show the elements
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data); // will show the last element its next is null
	}

	/*****************************************************************************
	 * To delete a node
	 * 
	 * @param item --> generic type
	 * @return void
	 * 
	 *         ****************************************************************************
	 */
	public void dequeue(T item) {
		int index = index(item); // to check the index of the item

		if (index == 0) // If index is 0 means deleting the First element

			head = head.next;

		else if (index == -1)// if item is not found

			System.out.println("Not found");

		else {
			Node currentNode = head; // node to traverse the list
			Node temporaryNode = null; // to store the address of the front node of the node which is to be deleted

			for (int fact = 0; fact < index - 1; fact++)
				currentNode = currentNode.next;

			temporaryNode = currentNode.next;
			currentNode.next = temporaryNode.next;
		}

	}

	/*******************************************************
	 * 
	 * To find the index of the item
	 * 
	 * @param item --> Generic type
	 * @return integer
	 * 
	 *******************************************************
	 */
	public int index(T item) {
		Node node = head; // creating node object
		int count = 0; // To count

		while (node.next != null)// loop till item is not found
		{

			node = node.next;
			count++;
			if (node.data == item || node.data.equals(item)) {
				return count;
			}
		}

		return -1; // return count
	}

	/**
	 * for removing the elements from the queue
	 * 
	 * @return T
	 */
	public T deQueue() {
		T data = null;
		if (head == null) {
			throw new NoSuchElementException("UnderFlow");
		} else {
			data = (T) head.data;
			head = head.next;
		}
		return data;
	}
}
