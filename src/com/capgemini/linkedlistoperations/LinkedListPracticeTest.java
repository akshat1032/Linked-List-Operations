package com.capgemini.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListPracticeTest {

	// Creating and testing simple linked list
	@Test
	public void testCreateLinkedList() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(70);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		myLinkedList.printLinkedList();
		boolean outcome = myLinkedList.head.equals(thirdNode) && thirdNode.getNext().equals(secondNode)
				&& secondNode.getNext().equals(firstNode) && myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(outcome);
	}

}
