package com.capgemini.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListInsertTest {

	// Creating and testing insert node between two nodes in linked list
	// Not inclusive of insert at beginning or at the end of the list
	@Test
	public void testLinkedListInsert() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.printLinkedList();
		LinkedListOperations<Integer> insertNode = new LinkedListOperations<Integer>(30);
		myLinkedList.insert(firstNode, secondNode, insertNode);
		myLinkedList.printLinkedList();
		boolean outcome = myLinkedList.head.equals(firstNode) && firstNode.getNext().equals(insertNode)
				&& insertNode.getNext().equals(secondNode) && myLinkedList.tail.equals(secondNode);
		Assert.assertTrue(outcome);
	}

}
