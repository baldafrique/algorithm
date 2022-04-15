package dataStructuresAlgorithms;

public class SimpleStack {
	int[] stack;
	int top;
	int maxSize;
	
	public SimpleStack(int n) {
		maxSize = n;
		stack = new int[n];
		top = 0;
	}
	
	public void push(int d) {
		if (top == maxSize) {
			System.out.println("Stack Full");
		}
		else {
			stack[top++] = d;
		}
	}
	
	public int pop() {
		if (empty()) {
			System.out.println("Stack Empty");
			return -999;
		}
		else {
			return stack[--top];
		}
	}
	
	public boolean empty() {
		return top == 0;
	}
	
	public void showStack() {
		for (int i = 0; i < top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SimpleStack me = new SimpleStack(10);
		
		for (int i = 0; i < 100; i++) {
			if (Math.random() > 0.5) {
				me.push(i);
			}
			else {
				me.pop();
			}
			me.showStack();
		}
	}
}
