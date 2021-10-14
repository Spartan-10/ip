package com.ip.LinkedList;

//class Node {
//	int data;
//	Node next;
//	
//	public Node(int data, Node next) {
//		this.data = data;
//		this.next = next;
//	}
//}
public class PopOperationLinkedList {

	public static void main(String[] args) {
		int[] keys = { 1, 2, 3, 4 };

		Node head = null;

		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		System.out.println("Linked List: ");
		printList(head);

		head = pop(head);

		System.out.println("Linked List After pop: ");
		printList(head);

	}

	private static Node pop(Node head) {

		if (head == null) {
			return null;
		} else {
			int res = head.data;
			head = head.next;
			System.out.println("Poped Node: " + res);
			return head;
		}
	}

	private static void printList(Node head) {
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}
		System.out.println("null");
	}
}
