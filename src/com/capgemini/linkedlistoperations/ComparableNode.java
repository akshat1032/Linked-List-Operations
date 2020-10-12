package com.capgemini.linkedlistoperations;

public interface ComparableNode <K extends Comparable<K>> {
	K getKey();
	void setKey(K key);
	
	ComparableNode getNext();
	void setNext(ComparableNode next);
}

