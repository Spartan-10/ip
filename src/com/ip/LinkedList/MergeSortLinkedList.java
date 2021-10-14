package com.ip.LinkedList;

public class MergeSortLinkedList {

	public static void main(String[] args) {
		
		int[] keys = {8,6,4,9,3,1};
		
		Node head = null;
		for(int k:keys) {
			head=new Node(k,head);
		}
		System.out.println("Linked List before Merge:");
		printList(head);
		
		head = mergeSort(head);
		
		System.out.println("Linked List after Merge: ");
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

	private static Node mergeSort(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		Node[] arr=frontBackSplit(head);
		Node front = arr[0];
		Node back = arr[1];
		
		front = mergeSort(front);
		back = mergeSort(back);
		
		return sortedMerge(front,back);
	}

	private static Node sortedMerge(Node front, Node back) {
		if(front == null) {
			return back;
		}
		else if(back == null) {
			return front;
		}
		
		Node result;
		if(front.data <= back.data) {
			result = front;
			result.next = sortedMerge(front.next,back);
		}else {
			result = back;
			result.next = sortedMerge(front,back.next);
		}
		return result;
	}

	private static Node[] frontBackSplit(Node source) {
		
		if(source == null || source.next == null) {
			return new Node[]{source,null};
		}
		
		Node slow = source;
		Node fast = source.next;
		
		while(fast != null) {
			fast=fast.next;
			if(fast != null) {
				slow=slow.next;
				fast=fast.next;
			}
		}
		
		Node[] arr = new Node[] {source,slow.next};
		slow.next=null;
		return arr;
	}
}
