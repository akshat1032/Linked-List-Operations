package com.capgemini.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class SortedLinkedListTest<K> {

	@Test
	public void testSortedLinkedList() {
		SortedLinkedListOperations<Integer> firstNode = new SortedLinkedListOperations<Integer>(56);
		SortedLinkedListOperations<Integer> secondNode = new SortedLinkedListOperations<Integer>(30);
		SortedLinkedListOperations<Integer> thirdNode = new SortedLinkedListOperations<Integer>(40);
		SortedLinkedListOperations<Integer> fourthNode = new SortedLinkedListOperations<Integer>(70);
		SortedLinkedList<K> sortedList = new SortedLinkedList<K>();
		sortedList.add(firstNode);
		sortedList.add(secondNode);
		sortedList.add(thirdNode);
		sortedList.add(fourthNode);
		sortedList.printLinkedList();
		boolean outcome = sortedList.head.equals(secondNode) && secondNode.getNext().equals(thirdNode)
				&& thirdNode.getNext().equals(firstNode) && firstNode.getNext().equals(fourthNode)
				&& sortedList.tail.equals(fourthNode);
		Assert.assertTrue(outcome);
	}

}
