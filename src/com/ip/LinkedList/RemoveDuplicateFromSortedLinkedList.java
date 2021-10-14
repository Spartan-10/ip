package com.ip.LinkedList;

public class RemoveDuplicateFromSortedLinkedList {

	public static void main(String[] args) {

		int[] keys = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5};

		Node head = null;
		for (int k : keys) {
			head = new Node(k, head);
		}

		printList(head);
		head = removeDuplicate(head);
		printList(head);

	}

	private static Node removeDuplicate(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node current = head;
		while (current.next != null) {

			if (current.data == current.next.data) {
				Node nextNext = current.next.next;
				current.next = nextNext;
			} else {
				current = current.next;
			}
		}

		return head;
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
