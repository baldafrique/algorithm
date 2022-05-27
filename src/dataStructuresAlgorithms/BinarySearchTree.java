package dataStructuresAlgorithms;

public class BinarySearchTree {

	private class Node {
		char data;
		Node left;
		Node right;
		Node parent;
		
		Node(char v) {
			this.data = v;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
		
		public String toString() {
			return "" + data;
		}
	}
	
	Node root;
	
	private BinarySearchTree() {
		root = null;
	}
	
	private void insert(char x) { // 17min~
		if (root == null) {
			root = new Node(x);
		}
		else if (x == root.data) {
			System.out.print("\nDuplication not allowed");
			return;
		}
		else if (x < root.data) {
			insert(root.left, x, root);
		}
		else if (x > root.data) {
			insert(root.right, x, root);
		}
	}
	
	private void insert(Node node, char x, Node parent) {
		if (node == null) {
			// insert
			Node newNode = new Node(x);
			if (parent.data > x) {
				parent.left = newNode;
			}
			else {
				parent.right = newNode;
			}
		}
		else if (x == node.data) {
			System.out.print("\nDuplication not allowed");
			return;
		}
		else if (x < node.data) {
			insert(node.left, x, node);
		}
		else if (x > node.data) {
			insert(node.right, x, node);
		}
	}
	
	private Node search(Node start, char x) {
		if (start == null || start.data == x) {
			return start;
		}
		else if (start.data > x) {
			return search(start.left, x);
		}
		else {
			return search(start.right, x);
		}
	}
	
	@SuppressWarnings("unused")
	private Node successor(Node v) {
		if (v == null) {
			return null;
		}
		else {
			Node p = v.right;
			while (p.left != null) {
				p = p.left;
			}
			return p;
		}
		
	}
	
	@SuppressWarnings("unused")
	private Node predecessor(Node v) {
		if (v == null) {
			return null;
		}
		else {
			Node p = v.left;
			while (p.right != null) {
				p = p.right;
			}
			return p;
		}
	}
	
	private void delete(char x) {
		Node node = search(root, x);
		if (node == null) {
			System.out.println("Not Found.");
		}
		else {
			delete(node, x);
		}
	}
	
	private void delete(Node v, char x) {
		// case 1 : no child
		if (v.left == null && v.right == null) {
			if (x < v.parent.data) {
				v.parent.left = null;
			}
			else {
				v.parent.right = null;
			}
		}
		// case 2 : 1 child
		
		// case 3 : 2 children <= successor/predecessor
	}
	
	@SuppressWarnings("unused")
	private void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data);
			preOrder(node.left);
			preOrder(node.right);
			
		}
	}
	
	private String inOrder(Node node) {
		if (node == null) {
			return "";
		}
		else {
			return inOrder(node.left) + " " + node.data + " " +inOrder(node.right);
		}
	}
	
	
	@SuppressWarnings("unused")
	private void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data);
		}
	}
	
	private int getHeight(Node node) {
		if (node == null) {
			return -1;
		}
		else {
			return 1 + Math.max(getHeight(node.left), getHeight(node.right));
		}
	}
	
	private int countNode(Node node) {
		if (node == null) {
			return 0;
		}
		else {
			return 1 + countNode(node.left) + countNode(node.right);
		}
	}
	
	private void showTree() {
		System.out.println(this.toString());
		System.out.println("Height : " + this.getHeight(root));
		System.out.println("Number of Nodes : " + this.countNode(root));
	}
	
	public String toString() {
		return inOrder(root);
	}
	
	public static void main(String[] args) { 
		BinarySearchTree bt = new BinarySearchTree();
		
		for (int i = 0; i < 30; i++) {
			int x = (int) (Math.random() * 1000);
			char y = (char) ((int) 'A' + x % 26);
			bt.insert(y);
		}
		
		System.out.println("\nTree Created : ");
		bt.showTree();
		
		char c = 'A';
		bt.delete(c);
		System.out.println("\nAfter Deleting " + c + " : ");
		bt.showTree();
		
		c = 'D';
		bt.delete(c);
		System.out.println("\nAfter Deleting " + c + " : ");
		bt.showTree();
		
		c = 'P';
		bt.delete(c);
		System.out.println("\nAfter Deleting " + c + " : ");
		bt.showTree();
		
		c = 'S';
		bt.delete(c);
		System.out.println("\nAfter Deleting " + c + " : ");
		bt.showTree();
	}
}
