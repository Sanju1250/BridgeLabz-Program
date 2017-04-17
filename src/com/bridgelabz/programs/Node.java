package com.bridgelabz.programs;

public class Node {
	String data;
	public Node next;

	public Node(String string) {
		this.data = string;
		this.next = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
