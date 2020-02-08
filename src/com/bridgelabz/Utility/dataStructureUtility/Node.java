package com.bridgelabz.dataStructure.utility;
/**
 * to have a node for the Linked List
 * @author  amresh kumar
 * @since   22-11-2019
 * @version 1.0
 */
public class Node<T> {
public Node next;
public T data;
public Node(){
	next=null;
	data=null;
}
public Node(T item){
	next=null;
	data=item;
}
}
