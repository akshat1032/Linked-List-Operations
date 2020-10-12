package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListDeleteElementTest {
	MyLinkedList myLinkedList = new MyLinkedList();

	// Delete certain element in linked list after finding node
	@Test
	public void testLinkedListDeleteElement() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(40);
		LinkedListOperations<Integer> fourthNode = new LinkedListOperations<Integer>(70);
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.append(fourthNode);
		myLinkedList.printLinkedList();
		INode nodeWithKey = myLinkedList.search(40);
		myLinkedList.delete(nodeWithKey);
		myLinkedList.printLinkedList();
		int expectedSize = 3;
		int actualSize = myLinkedList.size();
		
		Boolean outcome = myLinkedList.head.equals(firstNode) && firstNode.getNext().equals(secondNode)
				&& secondNode.getNext().equals(fourthNode) && myLinkedList.tail.equals(fourthNode);
		Assert.assertTrue(outcome);
		Assert.assertEquals(expectedSize, actualSize);
	}
}
