package com.capgemini.linkedlistoperations;

public class MyStack <K>{

	
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList<>();
	}

	//Push method
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	//Print stack
	public void printStack() {
		myLinkedList.printLinkedList();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}

}
