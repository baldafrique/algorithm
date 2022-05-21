package dataStructuresAlgorithms;

public class SimpleTree2 {
	
	private class Node {
		char data;
		Node left;
		Node right;
		
		Node(Node l, char v, Node r) {
			this.left = l;
			this.data = v;
			this.right = r;
		}
		
		public String toString() {
			return "" + data;
		}
	}
	
	Node root;
	
	private SimpleTree2() {
		root = null;
	}
	
	private Node makeTree(Node l, char v, Node r) {
		root = new Node(l, v, r);
		return root;
	}
	
	private void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data);
			inOrder(node.right);
		}
	}
	
	private void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data);
			preOrder(node.left);
			preOrder(node.right);
			
		}
	}
	
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
	
	public static void main(String[] args) {
		SimpleTree2 t = new SimpleTree2();
		
		Node n8 = t.makeTree(null, 'H', null);
		Node n9 = t.makeTree(null, 'I', null);
		Node n10 = t.makeTree(null, 'J', null);
		Node n11 = t.makeTree(null, 'K', null);
		Node n4 = t.makeTree(n8, 'D', null);
		Node n5 = t.makeTree(n9, 'E', n10);
		Node n6 = t.makeTree(null, 'F', null);
		Node n7 = t.makeTree(null, 'G', n11);
		Node n2 = t.makeTree(n4, 'B', n5);
		Node n3 = t.makeTree(n6, 'C', n7);
		Node n1 = t.makeTree(n2, 'A', n3);
		
		System.out.println("\nPreOrder Traverse : ");
		t.preOrder(n1);
		System.out.println("\nInOrder Traverse : ");
		t.inOrder(n1);
		System.out.println("\nPostOrder Traverse : ");
		t.postOrder(n1);
		
		System.out.println("\nHeight of Tree : " + t.getHeight(n1));
		System.out.println("\nNumber of Nodes : " + t.countNode(n1));
	}
}
