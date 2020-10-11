package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListDeleteElementTest {

	// Delete certain element in linked list after finding node
	@Test
	public void testLinkedListDeleteElement() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(40);
		LinkedListOperations<Integer> fourthNode = new LinkedListOperations<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.append(fourthNode);
		myLinkedList.size();
		myLinkedList.printLinkedList();
		INode nodeWithKey = myLinkedList.search(40);
		myLinkedList.delete(nodeWithKey);
		myLinkedList.printLinkedList();
		Boolean outcome = myLinkedList.head.equals(firstNode) && firstNode.getNext().equals(secondNode)
				&& secondNode.getNext().equals(fourthNode) && myLinkedList.tail.equals(fourthNode);
		Assert.assertTrue(outcome);
	}
}
