package com.shilei.test310;

public class Node<E> {
Node previous;
Node next;
E element;
public Node(Node previous, Node next, E element) {
	super();
	this.previous = previous;
	this.next = next;
	this.element = element;
}
public Node(E element) {
	super();
	this.element = element;
}
public Node() {
	super();
}

}
