package com.java.practicecode;

public class LinkedList {
	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + "]";
	}

	private static Node head;
	private Node tail;

	public LinkedList() {
		super();
		this.head = new Node("head");
		tail = head;
	}

	public Node head() {
		return head;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {
		Node next;
		private String data;

		@Override
		public String toString() {
			return this.data;
		}

		public Node(String data) {
			this.setData(data);
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Node("1"));
		l1.add(new Node("2"));
		l1.add(new Node("3"));

		l1.add(new Node("4"));
		l1.add(new Node("5"));
		
		LinkedList.Node current = head;
		int length = 0;
		LinkedList.Node middle = head;

		while (current.getNext() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.getNext();
			}
			current = current.getNext();
		}

		if (length % 2 == 1) {
			middle = middle.getNext();
		}

		System.out.println("length of LinkedList: " + length);
		System.out.println("middle element of LinkedList : " + middle);

	}

}
