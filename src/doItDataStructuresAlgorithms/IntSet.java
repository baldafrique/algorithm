package doItDataStructuresAlgorithms;

public class IntSet {
	private int max; // max of set
	private int num; // # of set
	private int[] set;
	
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		}
		catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// max # of set
	public int capacity() {
		return max;
	}
	
	// # of set
	public int size() {
		return num;
	}
	
	// search data and return index
	public int indexOf(int n) {
		for (int i = 0; i < num; i++) {
			if (set[i] == n) {
				return i; // search success
			}
		}
		return -1; // search failed
	}
	
	// check whether contains data
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	// add data in set
	public boolean add(int n) {
		// set is full or the data already exist
		if (num >= max || contains(n) == true) {
			return false;
		}
		else {
			set[num++] = n;
			return true;
		}
	}
	
	public boolean remove(int n) {
		if (num <= 0 || indexOf(n) == -1) {
			return false;
		}
		else {
			set[indexOf(n)] = set[--num];
			return true;
		}
	}
	
	// copy to set s
	public void copyTo(IntSet s) {
		int n = (s.max < num) ? s.max : num;
		for (int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	// copy set s
	public void copyFrom(IntSet s) {
		int n = (max < s.num) ? max : s.num; // # of element to copy
		for (int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	// check whether same set
	public boolean equalTo(IntSet s) {
		if (num != s.num) {
			return false;
		}
		
		for (int i = 0; i < num; i++) {
			int j = 0;
			for ( ; j < s.num; j++) {
				if (set[i] == s.set[j]) {
					break;
				}
			}
			if (j == s.num) {
				return false;
			}
		}
		return true;
	}
	
	// copy union of set s1 and set s2
	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1); // copy s1 to set
		for (int i = 0; i < s2.num; i++) {
			add(s2.set[i]); // copy element of s2 which uncontained in set 
		}
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer("{ ");
		for (int i : set) {
			ret.append(i + " ");
		}
		ret.append("}");
		return ret.toString();
		
	}
	
	public boolean isEmpty() {
		return num == 0;
	}
	
	public boolean isFull() {
		return num == max;
	}
	
	public void clear() {
		num = 0;
	}
}
