package main;

public class IntStack {

	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {
			
		}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public OverflowIntStackException() {
			
		}
	}
	
	public int push(int x) throws EmptyIntStackException {
		if (ptr >= stk.length) {
			throw new OverflowIntStackException();
		}
		else {
			return stk[ptr++] = x;
		}
	} 
	
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		else {
			return stk[--ptr];
		}
	}
	
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		else {
			return stk[ptr - 1];
		}
	}
	
	public int indexOf(int x) {
		for (int i = ptr; i >= 0; i--) {
			if (stk[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		for (int i = 0; i < stk.length; i++) {
			System.out.print(stk[i] + " ");
		}
		System.out.println();
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		stk = new int[max];
	}
}
