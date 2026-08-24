package practice;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class Practice{
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(60);
		root.left.left.left=new Node(50);
		root.right.right=new Node(70);
		root.right.right.left=new Node(80);
		root.left.right.right=new Node(90);	
		vertical(root, 0);
		System.out.println(map);
	}
	static Map<Integer,List<Integer>> map=new TreeMap<>();
	public static void vertical(Node node,int column) {
		if(node==null) {
			return;
		}
		map.putIfAbsent(column,new ArrayList<>());
		map.get(column).add(node.data);
		vertical(node.left,column-1);
		vertical(node.right,column+1);
		
	}
}