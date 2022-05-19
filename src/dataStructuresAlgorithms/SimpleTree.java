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
	
	private void showTree(TreeNode node) {
		if (node != null) {
			showTree(node.left);
			System.out.println(node.data);
			showTree(node.right);
		}
	}
	
	public static void main(String[] args) {
		SimpleTree t = new SimpleTree();
		
		TreeNode n1 = t.makeTree(null, 'A', null);
		TreeNode n2 = t.makeTree(null, 'B', null);
		TreeNode n3 = t.makeTree(n1, '*', n2);
		TreeNode n4 = t.makeTree(null, 'C', null);
		TreeNode n5 = t.makeTree(null, 'D', null);
		TreeNode n6 = t.makeTree(n4, '/', n5);
		TreeNode n7 = t.makeTree(n3, '-', n6);
		
		t.showTree(n7);
	}
}
