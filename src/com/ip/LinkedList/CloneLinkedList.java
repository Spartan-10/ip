package com.ip.LinkedList;

class Node{
	int data;
	Node next;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(int data) {
		this.data = data;
	}
}

public class CloneLinkedList {

	public static void main(String[] args) {
		int[] keys = {1,2,3,4};
		
		Node head = null;
		
		for (int i = keys.length-1 ; i >=0 ; i--) {
			head = new Node(keys[i],head);
		}
		
		System.out.println("Linked List: ");
		printList(head);
		
		Node clone = cloneList(head);
		
		System.out.println("Clone List: ");
		printList(clone);
	}

	private static void printList(Node head) {
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}
		System.out.println("null");
	}

	private static Node cloneList(Node head) {
		Node current = head;
		Node newList = null;
		Node tail = null;
		
		while(current != null) {
			
			if(newList == null) {
				newList = new Node(current.data,newList);
				tail = newList;
			}else {
				tail.next = new Node(current.data,tail.next);
				tail = tail.next;
			}
			current = current.next;
		}
		return newList;
	}
}
