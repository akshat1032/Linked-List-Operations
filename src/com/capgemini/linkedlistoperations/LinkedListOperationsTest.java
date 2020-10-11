package com.capgemini.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListOperationsTest {
	
	//Creating and testing simple linked list
	@Test
	public void testCreateLinkedList() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean outcome = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(outcome);
	}
}
