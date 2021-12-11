package com.ip.Tree;

public class PostorderTreeTraversal_Recursive {

	public static void main(String[] args) {

		postorderTraversal(CreateTree.createTree());
	}

	private static void postorderTraversal(Node root) {

		if (root == null)
			return;

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data + " ");

	}
}
