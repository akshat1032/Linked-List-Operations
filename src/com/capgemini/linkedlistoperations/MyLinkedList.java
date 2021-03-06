package com.capgemini.linkedlistoperations;

public class MyLinkedList<K> {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Method to add to top
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

	// Method to append
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

	// Method to print list
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

	// Method to insert between any two nodes
	// Not inclusive of inserting at beginning or end of the list
	public void insert(INode firstNode, INode insertNode) {
		INode tempNode = firstNode.getNext();
		firstNode.setNext(insertNode);
		insertNode.setNext(tempNode);
	}

	// Delete first element of linked list
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	// Delete last element of linked list
	public void popLast() {
		INode tempNode = head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode.setNext(null);
	}

	// Search element and return node
	public INode search(K search) {
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(search)) {
				break;
			}
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	// Delete a node
	public void delete(INode nodeToDelete) {
		if (nodeToDelete.equals(this.head)) {
			this.pop();
		}
		if (nodeToDelete.equals(this.tail)) {
			this.popLast();
		} else {
			INode tempNode = head;
			while (tempNode.getNext() != nodeToDelete) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(nodeToDelete.getNext());
			nodeToDelete.setNext(null);
		}

	}

	// Find size of linked list
	public int size() {
		int size = 0;
		INode node = head;
		if (node == null) {
			size = 0;
		} else {
			while (node.getNext() != null) {
				size++;
			}
		}
		return size;
	}

}
