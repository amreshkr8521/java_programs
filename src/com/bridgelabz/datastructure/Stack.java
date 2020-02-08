package com.bridgelabz.DataStructure;

import java.util.NoSuchElementException;

/**
 * A stack is an abstract data type that serves as a collection of elements,
 * with two principal operations: push, which adds an element to the collection,
 * and pop, which removes the most recently added element that was not yet
 * removed
 * 
 * @author amresh kumar
 * @since 26-11-2019
 * @version 1.0
 *
 */

public class Stack {
	int top;
	char[] stackArray;
	int size;

	/**
	 * define parameterized constructor to initialize the object of stack
	 * 
	 * @param s ==> integer
	 */
	public Stack(int size) {
		this.size = size;
		stackArray = new char[size];
		top = 0;
	}

	/**
	 * To add the element in the stack
	 * 
	 * @param data -->integer
	 */
	public void push(char data) {
		if (top == size) {
			System.out.println("Overflow");
		} else {
			stackArray[top++] = data;
		}
	}

	/**
	 * To remove the elements from the stack
	 * 
	 * @param null
	 * @return char
	 */
	public char pop() {
		char data = 0;
		if (isEmpty()) {
			throw new NoSuchElementException("UnderFlow");
		} else {
			data = stackArray[--top];
			stackArray[top] = 0;

		}
		return data; // return the element

	}

	/**
	 * To get the last elements from the stack
	 * 
	 * @return integer
	 */
	public int peek() {
		int data = stackArray[top - 1];
		return data;
	}

	/**
	 * To check the stack is empty or not
	 * 
	 * @param null
	 * @return boolean
	 */
	public boolean isEmpty() {
		return (top <= 0);
	}

	/**
	 * to check the size of the stack
	 * 
	 * @return integer
	 */
	public int size() {
		return top;
	}

	/**
	 * to print the elements of the stack
	 * 
	 * @param null
	 * @return void
	 * 
	 */
	public void show() {
		for (int data : stackArray) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
