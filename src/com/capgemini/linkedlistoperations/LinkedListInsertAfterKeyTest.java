package com.capgemini.linkedlistoperations;


import org.junit.Assert;
import org.junit.Test;

public class LinkedListInsertAfterKeyTest {

	// Insert element in linked list after key
	@Test
	public void testLinkedListInsertAfterKey() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.printLinkedList();
		INode nodeWithKey = myLinkedList.search(30);
		LinkedListOperations<Integer> insertNode = new LinkedListOperations<Integer>(40);
		myLinkedList.insert(nodeWithKey, insertNode);
		myLinkedList.printLinkedList();
		Boolean outcome = myLinkedList.head.equals(firstNode) && firstNode.getNext().equals(secondNode)
				&& secondNode.getNext().equals(insertNode) && insertNode.getNext().equals(thirdNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(outcome);
	}

}
