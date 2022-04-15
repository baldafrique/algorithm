package dataStructuresAlgorithms;

public class MyArrayStack {
	MyArrayList3 stack;
	
	public MyArrayStack(int size) {
		stack = new MyArrayList3(size);
	}
	
	public void push(MyData d) {
		stack.addLast(d);
	}
	
	public MyData pop() {
		return stack.removeLast();
	}
	
	public MyData peek() {
		return stack.get(stack.sizeOf() - 1);
	}
	
	public boolean empty() {
		return stack.sizeOf() == 0;
	}
	
	public void showStack() {
		System.out.println(stack.toString());
	}

	public static void main(String[] args) {
		MyArrayStack me = new MyArrayStack(10);
		
		me.push(new MyData("abc", 1));
		me.push(new MyData("def", 2));
		me.push(new MyData("ghi", 3));
		me.showStack();
		System.out.println(me.pop());
		System.out.println(me.pop());
	}

}
