package dataStructuresAlgorithms;

import java.util.Stack;

public class HanoiTowerIteration {
	
	enum Rtype {PLATE, SUBTOWER}
	
	private class Record {
		Rtype type;
		int n;
		int from;
		int to;
		
		private Record(Rtype t, int n, int i, int j) {
			type = t;
			this.n = n;
			from = i;
			to = j;
		}
	} 
	
	Stack<Record> stack = new Stack<>();
	
	private void move(int n, int i, int j) {
		
		stack.push(new Record(Rtype.SUBTOWER, n, i, j));
		
		while (!stack.empty()) {
			Record temp = stack.pop();
			if (temp.type == Rtype.PLATE || temp.n == 1) {
				System.out.println("Plate " + temp.n + " : " + temp.from + " → " + temp.to);
			}
			else { // type이 SUBTOWER인 경우
				int k = 3 - temp.from - temp.to;
				stack.push(new Record(Rtype.SUBTOWER, temp.n - 1, k, temp.to));
				stack.push(new Record(Rtype.PLATE, temp.n, temp.from, temp.to));
				stack.push(new Record(Rtype.SUBTOWER, temp.n - 1, temp.from, k));			
			}
		}
		
	}

	public static void main(String[] args) {
		
		HanoiTowerIteration myT = new HanoiTowerIteration();
		
		myT.move(4, 0, 1);
	}

}
