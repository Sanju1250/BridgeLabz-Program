package com.bridgelabz.programs;

import java.util.*;
import java.io.*;

public class LinkedList {
	Node head = null;

	public void add(String string) {
		Node my = new Node(string);
		if (head == null) {
			Node temp = head;
			head = my;
			head.next = temp;
			return;
		}
		Node temp1 = head;
		while (temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = my;
		return;
	}

	public void display() {

		Node temp1 = head;
		while (temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}

	}
	public ArrayList fileWriter() {
		ArrayList list=new ArrayList();
		Node temp1 = head;
		while (temp1 != null) {
			System.out.println(temp1.data);
			list.add(temp1.data);
			temp1 = temp1.next;
		}
      return list;
	}

	boolean compare(String string) {
		Node temp1 = head;
		while (temp1 != null) {
			if (((String) temp1.data).equalsIgnoreCase(string)) {
				System.out.println("the given word is found");
				return true;
			}
			temp1 = temp1.next;
		}
		System.out.println("the given word is not found");
		return false;
	}

	public void remove(String st) {
		Node currNode = head;

		Node prevNode = null;

		if (currNode.data.equalsIgnoreCase(st)) {
           head = head.next;
           return;

		}

		while (currNode != null && !currNode.data.equalsIgnoreCase(st)) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = currNode.next;
	}

}
