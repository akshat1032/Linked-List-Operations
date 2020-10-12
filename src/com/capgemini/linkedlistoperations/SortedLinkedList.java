package com.capgemini.linkedlistoperations;

public class SortedLinkedList<K> {

	public ComparableNode head;
	public ComparableNode tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Add elements in sorted order
	public <K extends Comparable<K>> void add(ComparableNode myNode) {
		if (this.head == null && this.tail == null) {
			this.head = myNode;
			this.tail = myNode;
		}
		else if (this.head.getKey().compareTo(myNode.getKey())>0) {
			myNode.setNext(head);
			this.head = myNode;
		}
		else if (this.tail.getKey().compareTo(myNode.getKey())<0) {
			this.tail.setNext(myNode);
			myNode.setNext(null);
			this.tail = myNode;
		}else {
			ComparableNode temp = head, previousNode = null;
			while (temp != null) {
				if (temp.getKey().compareTo(myNode.getKey()) > 0) {
					previousNode.setNext(myNode);
					myNode.setNext(temp);
				}
				previousNode = temp;
				temp = temp.getNext();
			}
		}

	}

	// Method to print list
	public void printLinkedList() {
		String myNodes = "LinkedList Sequence: ";
		ComparableNode tempNode = head;
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
