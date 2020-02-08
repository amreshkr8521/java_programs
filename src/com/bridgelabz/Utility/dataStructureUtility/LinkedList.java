package com.bridgelabz.dataStructure.utility;
/**
 * All Linked List implementation 
 * linked list is a list which has two part , first part has value and next part has address of the next node
 * unit of linked list is called node. 
 * In this class insertion of elements is done at starting, at any index value and at the end of linked list,
 * deletion of element is also done at the index given by the user
 * 
 * @author 	amresh kumar
 * @since 	22-11-2019
 * @version 1.0
 * @modified made to generic
 */

public class LinkedList<T> {
 Node head;


/***************************************************************
 * To insert the data in the linked list
 * 
 * @param 	data --> Generic
 * @return 	void
 * 
 * *************************************************************
 */
public  void add(T data) {
	Node node=new Node();// creating new node
	node.data=data; //inserting data to new node
	node.next=null;
	
	if(head==null) 
		
		head=node;
	
	else {
		Node n=head;
		while(n.next!=null) //traversing through linked list till last node
		
			n=n.next;
		
		n.next=node; //after the last node is found than the new node is assigned 
	}
}
 /***********************************************************************
  * To Show all the elements of the linked list
  * 
  * @param 	no parameter
  * @return void
  * 
  * *********************************************************************
  */

public void show() {
	Node n=head;
	if (head == null) {
		System.out.println("list is empty..!!");
	} else {
	while(n.next!=null) // loop to traverse till next is null
	{
		
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data); //will show the last element of the list as its next is null
}
}

/****************************************************************************
 * To insert the element at given index were the user wants to insert
 * 
 * @param  Index --> integer
 * @param  data	--> Generic
 * @return void
 * 
 * ***************************************************************************
 */
public  void insert(int Index,T data) {
	Node node=new Node();		//temporary node created
	node.data=data;
	node.next=null;
	Node n=new Node();
	n=head;
	if(Index==0) 
		
		insertAtStart(data);		//if index is 0 then this operation is done
	
	else
		
	for(int fact=0;fact<Index-1;fact++) //traversing through the linked list
		n=n.next;
	
	node.next=n.next; 
	n.next=node;
	
}


/************************************************************************
 * To insert the element at the starting point of the linked list 
 * 
 * @param data -->Generic
 * @return void
 * 
 * **********************************************************************
 */
public  void insertAtStart(T data) {
	Node node=new Node();
	node.data=data;
	node.next=head;				//assign head address to the new node 
	head=node;					// assign head with the new node
}

/*******************************************************************************
 * To delete at a given index from a linked list
 * 
 * @param  index --> integer
 * @return void
 * 
 * *****************************************************************************
 */
public T pop(int pos) {
	
	Node current = head;
	Node prev = null;
	T data = null;
	if (pos == 0) {
		data = (T) head.data;
		head = head.next;
		return (T) data;
	}
	for (int i = 0; i < pos; i++) {
		prev = current;
		current = current.next;
	}
	prev.next = current.next.next;
	return (T) current.data;

}

/**
 * To remove a given item which is passed by the user
 * if the passed item is not found than say "Not Found"
 * 
 * @param 	item --> Generic type
 * @return	void
 */

public void remove(T item) {
	Node current = head;
	Node prev = null;
	if (head == null) {
		System.out.println("List is empty..!!");
		return;
	}
	if (head.data.equals(item)) {
		head = head.next;
	} else {
		while (current.next != null) {
			if (current.data.equals(item)) {
				System.out.println("Removed :" + current.data);
				prev.next = current.next;
				return;
			}
			prev = current;
			current = current.next;
		}
	}
}


/*******************************************************
 * 
 * To find the index of the item
 * 
 * @param 	item --> Generic type
 * @return 	integer
 * 
 * ******************************************************
 */
public int index(T item) {
	Node node=head; //creating node object
	int count=0; 	//To count
	
		while(node.next!=null)//loop till item is not found
		{
					
			node=node.next;
			count++;
			if(node.data==item || node.data.equals(item)) {
				return count++;
			}
		}
		
		
	return count++; // return count
}

/********************************************
 * 
 * To search the passed item from the list
 * 
 * @param 	item --> Generic
 * @return	integer
 * 
 * ******************************************
 */
public boolean search(T item) {
	Node n=head; //creating node object and storing head to it
	
	
		while(n.next!=null) //loop will flow till item is not found
		{
					
			n=n.next;
			
			if(n.data==item || n.data.equals(item)) //if item is not found in the list
			
				
				return true;
			
		}
		
		
		
	return false; //returning the index value of the item
}


/********************************************
 * 
 * To check the list is empty or not
 * 
 * @return boolean
 * 
 * ******************************************
 */
public  boolean isEmpty() {
	Node n=head; //creating node object and storing head to it
	if(n==null)
		return true; //returning true if list is empty
	else
		return false; //returning false if list is empty
}


/**********************************
 * to find the size of the list
 * 
 * @return integer
 * 
 * ********************************
 */
public int size() {
	Node node=head; //creating the node object to store the head
	int count=0;
	while(node.next!=null) // traverse all the element of the list
	{
		count++;
		node=node.next;
	}
	return count++; //return the size of list
}


/*******************************************************
 * 
 * To remove the last element of the list and return it
 * 
 * @return <T>
 * 
 *  *****************************************************
 */
public T pop(){
	T removed=null;
	Node n=head;
	if(size()==0) // If index is 0 means deleting the First element
		
		head=head.next;
	
	else
	{
				
		Node n1=null;		// to store the address of the front node of the node which is to be deleted
		int size=size();
		for(int fact=0;fact<size-1;fact++) 
			n=n.next;
		removed=(T)n.data;
		System.out.println(removed);
		n.next=null;			
		
	}
	System.out.println(removed);
return removed; //return the removed item
}

public T read(int pos) {
	Node node=head;
	for(int count=0;count<pos;count++) {
		node=node.next;
	}
	return (T) node.data;
}




// generic at 22-11-2019 at 18:45
}


