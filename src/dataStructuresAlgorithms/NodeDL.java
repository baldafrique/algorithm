package dataStructuresAlgorithms;

public class NodeDL {
	MyData data;
	NodeDL left, right;
	
	public NodeDL() {
		
	}
	
	public NodeDL(MyData d) {
		data = d;
		left = null;
		right = null;
	}
	
	public NodeDL(String s, int v) {
		data = new MyData(s, v);
		left = null;
		right = null;
	}
	
	public String toString() {
		return data.toString();
	}
}
