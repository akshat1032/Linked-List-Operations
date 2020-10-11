package com.capgemini.linkedlistoperations;

public class LinkedListOperations<K> {

	//Instance variables for key and address of node	
	private K key;
	private LinkedListOperations next;

	public LinkedListOperations(K key) {
		this.key = key;
		this.next = null;
	}
	
	//Getters and setters
	public LinkedListOperations getNext() {
		return next;
	}

	public void setNext(LinkedListOperations next) {
		this.next = next;
	}
}
