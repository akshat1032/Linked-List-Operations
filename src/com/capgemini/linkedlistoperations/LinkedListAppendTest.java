package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListAppendTest {

	// Creating and testing simple linked list
	@Test
	public void testCreateLinkedList() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.printLinkedList();
		boolean outcome = myLinkedList.head.equals(firstNode) && firstNode.getNext().equals(secondNode)
				&& secondNode.getNext().equals(thirdNode) && myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(outcome);
	}

}
