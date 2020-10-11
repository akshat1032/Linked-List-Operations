package com.capgemini.linkedlistoperations;

public class LinkedListOperations<K> implements INode<K> {

	// Instance variables for key and address of node
	private K key;
	private INode next;

	public LinkedListOperations(K key) {
		this.key = key;
		this.next = null;
	}

	// Getters and setters
	public INode getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}
}
