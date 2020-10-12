package com.capgemini.linkedlistoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyStackPeakAndPopTest {
	
	//Peak test
	@Test
	public void testMyStackPeak() {
		MyStack myStack = new MyStack();
		LinkedListOperations<Integer> firstNode = new LinkedListOperations<>(70);
		LinkedListOperations<Integer> secondNode = new LinkedListOperations<>(30);
		LinkedListOperations<Integer> thirdNode = new LinkedListOperations<>(56);
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(thirdNode,peak);
	}

}
