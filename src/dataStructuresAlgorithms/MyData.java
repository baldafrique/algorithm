package dataStructuresAlgorithms;


public class MyData {
	String key;
	int value;
	
	public MyData() {
		
	}
	
	public MyData(String s, int v) {
		key = s;
		value = v;
	}
	
	public boolean equals(MyData that) {
		if (this.key == that.key) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(MyData that) {
		if (this.key.compareTo(that.key) > 0) {
			return 1;
		}
		else if (this.key.compareTo(that.key) < 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return "" + "(" + key + ", " + value + ") ";
	}
}
