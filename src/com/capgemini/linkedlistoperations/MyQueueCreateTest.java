package com.capgemini.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueCreateTest {

	@Test
	public void testCreateQueue() {
		MyQueue myQueue = new MyQueue();
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<>(70);
		myQueue.enqueu(firstNode);
		myQueue.enqueu(secondNode);
		myQueue.enqueu(thirdNode);
		myQueue.printQueue();
		boolean outcome = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(outcome);
	}

}
