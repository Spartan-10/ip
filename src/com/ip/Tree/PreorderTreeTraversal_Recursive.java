package com.ip.Tree;

public class PreorderTreeTraversal_Recursive {

	public static void main(String[] args) {

		preorderTraversal(CreateTree.createTree());
	}

	private static void preorderTraversal(Node root) {

		if (root == null)
			return;

		System.out.print(root.data + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);

	}
}
