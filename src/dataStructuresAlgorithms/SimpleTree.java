package dataStructuresAlgorithms;

public class SimpleTree {
	
	private class TreeNode {
		char data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(TreeNode l, char v, TreeNode r) {
			this.left = l;
			this.data = v;
			this.right = r;
		}
		
		public String toString() {
			return "" + data;
		}
	}
	
	TreeNode root;
	
	private SimpleTree() {
		root = null;
	}
	
	private TreeNode makeTree(TreeNode l, char v, TreeNode r) {
		root = new TreeNode(l, v, r);
		return root;
	}
	
	@SuppressWarnings("unused")
	private void showTree(TreeNode node) {
		if (node != null) {
			showTree(node.left);
			showTree(node.right);
			System.out.println(node.data);
		}
	}
	
	@SuppressWarnings("unused")
	private void treeInArray(TreeNode node) {
		char[] treeArray = new char[8];
		
		convert(node, treeArray, 1);
		System.out.println("Tree in Array");
		for (int i = 1; i < 8; i++) {
			System.out.println("index " + i + " : " + treeArray[i]);
		}
	}
	
	private void convert(TreeNode node, char[] treeArray, int i) {
		if (node != null) {
			treeArray[i] = node.data;
			convert(node.left, treeArray, i * 2);
			convert(node.right, treeArray, i * 2 + 1);
		}
	}
	

	private void preorderTraversal(TreeNode node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}
	
	private void inorderTraversal(TreeNode node) {
		if (node != null) {
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			inorderTraversal(node.right);
		}
	}
	
	private void postorderTraversal(TreeNode node) {
		if (node != null) {
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	public static void main(String[] args) {
		SimpleTree t = new SimpleTree();
		
		TreeNode n1 = t.makeTree(null, 'H', null);
		TreeNode n2 = t.makeTree(null, 'I', null);
		TreeNode n3 = t.makeTree(null, 'J', null);
		TreeNode n4 = t.makeTree(null, 'K', null);
		TreeNode n5 = t.makeTree(n1, 'D', null);
		TreeNode n6 = t.makeTree(n2, 'E', n3);
		TreeNode n7 = t.makeTree(null, 'F', null);
		TreeNode n8 = t.makeTree(null, 'G', n4);
		TreeNode n9 = t.makeTree(n5, 'B', n6);
		TreeNode n10 = t.makeTree(n7, 'C', n8);
		TreeNode n11 = t.makeTree(n9, 'A', n10);
		
		System.out.print("preorder traversal : ");
		t.preorderTraversal(n11);
		System.out.print("\ninorder traversal : ");
		t.inorderTraversal(n11);
		System.out.print("\npostorder traversal : ");
		t.postorderTraversal(n11);
	}
}
