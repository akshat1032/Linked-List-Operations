package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueDequeueTest {
	
	//Delete first element of queue
	@Test
	public void testDequeue() {
		MyQueue myQueue = new MyQueue();
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<>(56);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<>(70);
		myQueue.enqueu(firstNode);
		myQueue.enqueu(secondNode);
		myQueue.enqueu(thirdNode);
		myQueue.printQueue();
		INode dequeue = myQueue.dequeue();
		Assert.assertEquals(firstNode,dequeue);
	}

}
