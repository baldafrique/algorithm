package main;

public class IntStackX {

	private int max;
	private int ptrA;
	private int ptrB;
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
	
	public int push(boolean isA, int x) throws EmptyIntStackException {
		if (ptrA > ptrB) {
			throw new OverflowIntStackException();
		}
		else if (isA) {
				return stk[ptrA++] = x;
		}
		else {
				return stk[ptrB--] = x;
		}
		
	} 
	
	public int pop(boolean isA) throws EmptyIntStackException {
		if (isA) {
			if (ptrA <= 0) {
				throw new EmptyIntStackException();
			}
			else {
				return stk[--ptrA];
			}
		}
		else {
			if (ptrB >= max - 1) {
				throw new EmptyIntStackException();
			}
			else {
				return stk[++ptrB];
			}
		}
		
	}
	
	public int peek(boolean isA) throws EmptyIntStackException {
		if (isA) {
			if (ptrA <= 0) {
				throw new EmptyIntStackException();
			}
			else {
				return stk[ptrA - 1];
			}
		}
		else {
			if (ptrB >= max - 1) {
				throw new EmptyIntStackException();
			}
			else {
				return stk[ptrB + 1];
			}
		}
		
	}
	
	public int indexOf(boolean isA, int x) {
		if (isA) {
			for (int i = ptrA; i >= 0; i--) {
				if (stk[i] == x) {
					return i;
				}
			}
		}
		else {
			for (int i = ptrB + 1; i < max; i++) {
				if (stk[i] == x) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public void clear(boolean isA) {
		if (isA) {
			ptrA = 0;
		}
		else {
			ptrB = max - 1;
		}
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(boolean isA) {
		return isA ? ptrA : max - ptrB - 1;
	}
	
	public boolean isEmpty(boolean isA) {
		return isA ? ptrA <= 0 : ptrB >= max - 1;
		
	}
	
	public boolean isFull() {
		return ptrA > ptrB;
	}
	
	public void dump(boolean isA) {
		if (isA) {
			for (int i = 0; i < stk.length; i++) {
				System.out.print(stk[i] + " ");
			}
		}
		else {
			for (int i = max - 1; i > ptrB; i--) {
				System.out.print(stk[i] + " ");
			}
		}
		
		System.out.println();
	}
	
	public IntStackX(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
		
	}
}
