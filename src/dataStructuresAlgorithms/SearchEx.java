package dataStructuresAlgorithms;

public class SearchEx {
	int count;
	int[] data;
	
	public SearchEx(int[] in) {
		data = in;
	}
	
	public void resetCount() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	private int search(int n, int x) {
		count++;
		if (n == 0) {
			return -1;
		}
		
		if (data[n - 1] == x) {
			return n - 1;
		}
		
		return search(n - 1, x);
	}
	
	public int searchIter(int n, int x) {
		for (int i = n - 1; i > 0; i--) {
			count++;
			if (data[i] == x) {
				return i;
			}
		}
		return -1;
	}
	

	private int binarySearch(int p, int r, int x) {
		count++;
		
		if (p > r) {
			return -1;
		}
		
		int m = (p + r) / 2;
		
		if (x < data[m]) {
			return binarySearch(p, m - 1, x); 
		}
		else if (x > data[m]) {
			return binarySearch(m + 1, r, x);
		}
		else {
			return m;
		}
		
	}

	public static void main(String[] args) {
		int[] input = {1, 3, 6, 7, 9, 11, 14, 18, 20, 22, 26, 30, 32, 35, 41, 46, 55};
		
		SearchEx me = new SearchEx(input);
		
		System.out.println(me.search(input.length, 26) + " " + me.getCount());
		me.resetCount();
		System.out.println(me.searchIter(input.length, 26) + " " + me.getCount());
		me.resetCount();
		System.out.println(me.binarySearch(0, input.length - 1, 26) + " " + me.getCount());
	}

}
