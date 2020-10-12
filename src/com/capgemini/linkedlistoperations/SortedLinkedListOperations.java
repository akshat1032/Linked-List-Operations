package com.capgemini.linkedlistoperations;

public class SortedLinkedListOperations<K> implements ComparableNode {
	// Instance variables for key and address of node
	private K key;
	private ComparableNode next;

	public SortedLinkedListOperations(K key) {
		this.key = key;
		this.next = null;
	}

	public Comparable getKey() {
		return  (Comparable) key;
	}

	public void setKey(Comparable key) {
		this.key = (K) key;
	}

	@Override
	public ComparableNode getNext() {
		return next;
	}

	@Override
	public void setNext(ComparableNode next) {
		this.next = next;
	}
	
}
