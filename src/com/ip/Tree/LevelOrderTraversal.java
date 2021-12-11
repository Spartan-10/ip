package com.ip.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		levelorderTraversal(CreateTree.createTree());
	}

	private static void levelorderTraversal(Node root) {
		
		if(root == null)
			return;
		
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		Node curr = null;
		
		while(!queue.isEmpty()) {
			curr = queue.poll();
			
			System.out.print(curr.data+" ");
			
			if (curr.left != null) {
				queue.add(curr.left);
			}
			if(curr.right != null) {
				queue.add(curr.right);
			}
		}
		
	}
}
