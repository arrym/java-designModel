package com.java.composite;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.tree.TreeNode;

public class TreeDNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<>();
	
	public TreeDNode(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name ;
	}
	
	public TreeNode getParent(){
		return parent;
	}
	
	public void setParent(TreeNode parent){
		this.parent = parent;
	}
	
	public void add(TreeNode node){
		children.add(node);
	}
	
	public void remove(TreeNode node){
		children.add(node);
	}
	
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
}
