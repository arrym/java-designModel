package com.java.composite;

/**
 * 树
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class Tree {

	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);

		System.out.println("build the tree finished!");
	}

}
