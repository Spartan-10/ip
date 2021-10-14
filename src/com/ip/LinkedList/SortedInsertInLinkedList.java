package com.ip.LinkedList;

public class SortedInsertInLinkedList {

	public static void main(String[] args) {
		int[] keys= {2,7,10,15};
		
		Node head = null;
		for(int i=keys.length-1;i>=0;i--) {
			head= new Node(keys[i],head);
		}
		
		System.out.println("Sorted Linked List:");
		printList(head);
		
		System.out.println("Insert 5: ");
		head = sortedInsert(head,new Node(5));
		
		System.out.println("Insert 1: ");
		head = sortedInsert(head,new Node(1));
		
		System.out.println("Insert 8: ");
		head = sortedInsert(head,new Node(8));
		
		printList(head);
		
	}

	private static void printList(Node head) {
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data+" -> ");
			ptr=ptr.next;
		}
		System.out.println("null");
	}

	private static Node sortedInsert(Node head, Node newNode) {
		
		if(head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
			return head;
		}else {
			Node current = head;
			while(current.next != null && current.next.data < newNode.data) {
				current= current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			return head;
		}
		
	}
}
