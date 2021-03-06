package com.ip.LinkedList;

public class MoveEvenNodeToEndofLinkedlist {

	public static void main(String[] args) {
		int[] keys = {1,2,3,4,5,6,7,8};
		
		Node head = null;
		
		for(int k: keys) {
			head = new Node(k,head);
		}
		
		printList("Before: ",head);
		
		moveEvenNode(head);
		
		printList("After: ",head);
		
	}

	private static void moveEvenNode(Node head) {

		if(head == null) {
			return;
		}
		
		Node odd = head;
		Node even = null, prev = null;
		
		while(odd != null && odd.next != null) {
			if(odd.next != null) {
				Node newNode = odd.next;
				odd.next = odd.next.next;
				
				newNode.next = even;
				even = newNode;
			}
			
			prev = odd;
			odd = odd.next;
		}
		
		if(odd != null )
			odd.next = even;
		else
			prev.next=even;
	}

	private static void printList(String string, Node head) {
		System.out.print(string);
		
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data+ " -> ");
			ptr=ptr.next;
		}
		System.out.println("null");
	}
}
