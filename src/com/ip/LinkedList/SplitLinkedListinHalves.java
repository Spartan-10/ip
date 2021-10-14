package com.ip.LinkedList;

public class SplitLinkedListinHalves {

	public static void main(String[] args) {
		int[] keys = {6,3,4,8,2,9};
		
		Node head = null;
		for(int k : keys) {
			head = new Node(k,head);
		}
		
		printList("Initial Linked List = ",head);
		
		Node[] nodes = frontBackSplit(head);
		
		printList("Front Linked List = ",nodes[0]);
		printList("Back Linked List = ",nodes[1]);
	}

	private static void printList(String string, Node head) {
		System.out.println(string);
		
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr=ptr.next;
		}
		
		System.out.println("null");
	}

	private static Node[] frontBackSplit(Node head) {
		if(head == null || head.next == null) {
			return new Node[] {head,null};
		}
		
		Node slow = head;
		Node fast = head.next;
		
		while(fast != null) {
			fast = fast.next;
			if(fast != null) {
				fast=fast.next;
				slow=slow.next;
			}
		}
		
		Node[] res = new Node[] {head,slow.next};
		slow.next=null;
		
		return res;
	}
}
