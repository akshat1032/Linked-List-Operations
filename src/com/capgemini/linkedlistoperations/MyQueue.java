package com.capgemini.linkedlistoperations;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList<>();
	}

	// Add element to queue
	public void enqueu(INode myNode) {
		myLinkedList.append(myNode);
	}
	
	//Print queue
	public void printQueue() {
		myLinkedList.printLinkedList();
	}

}
