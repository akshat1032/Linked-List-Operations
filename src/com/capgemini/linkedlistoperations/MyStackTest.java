package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void testCreateStack() {
		MyStack myStack = new MyStack();
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<>(70);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<>(56);
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		boolean outcome = thirdNode.getNext().equals(secondNode) && secondNode.getNext().equals(firstNode);
		Assert.assertTrue(outcome);
	}

}
