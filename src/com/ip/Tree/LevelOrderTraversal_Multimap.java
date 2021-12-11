package com.ip.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This is the solution to print nodes of different levels in a separate line.
public class LevelOrderTraversal_Multimap {

	public static void main(String[] args) {
		levelorder(CreateTree.createTree());
	}

	private static void levelorder(Node root) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		traverse(root, 1, map);

		for (int i = 1; i <= map.size(); i++) {
			System.out.println("Level " + i + " : " + map.get(i));
		}
	}

	private static void traverse(Node root, int level, Map<Integer, List<Integer>> map) {

		if (root == null)
			return;

		map.putIfAbsent(level, new ArrayList<Integer>());
		map.get(level).add(root.data);

		traverse(root.left, level + 1, map);
		traverse(root.right, level + 1, map);

	}
}
