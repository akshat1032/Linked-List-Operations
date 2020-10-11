package com.capgemini.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListPopLastTest {

	// Delete last element of linked list
	@Test
	public void testLinkedListPopLast() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.printLinkedList();
		myLinkedList.popLast();
		myLinkedList.printLinkedList();
		boolean outcome = myLinkedList.head.equals(firstNode) && firstNode.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(secondNode);
		Assert.assertTrue(outcome);
	}

}
