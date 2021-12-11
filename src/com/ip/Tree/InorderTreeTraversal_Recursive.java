package com.ip.Tree;

public class InorderTreeTraversal_Recursive {

	public static void main(String[] args) {
		inorderTraversal(CreateTree.createTree());
	}

	private static void inorderTraversal(Node root) {

		if (root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);

	}
}
