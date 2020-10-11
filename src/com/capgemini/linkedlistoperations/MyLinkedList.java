package com.capgemini.linkedlistoperations;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	//Method to add to top
	public void add(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
	//Method to append
	public void append(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
			
		}
	}

	public void printLinkedList() {
		String myNodes = "LinkedList Sequence: ";
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes = myNodes + tempNode.getKey();
			if (!tempNode.equals(tail)) {
				myNodes = myNodes + "->";
			}
			tempNode = tempNode.getNext();
		}
		myNodes = myNodes + tempNode.getKey();
		System.out.println(myNodes);
	}
}
