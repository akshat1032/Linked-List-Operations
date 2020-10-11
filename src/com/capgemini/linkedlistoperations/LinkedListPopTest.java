package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListPopTest {
	
	//Delete first element of linked list
	@Test
	public void testLinkedListPop() {
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<Integer>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<Integer>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.pop();
		myLinkedList.printLinkedList();
		boolean outcome = myLinkedList.head.equals(secondNode) && secondNode.getNext().equals(thirdNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(outcome);
	}

}
