package dataStructuresAlgorithms;

public class MyArrayQueue {
	MyArrayList3 queue;
	
	public MyArrayQueue(int size) {
		queue = new MyArrayList3(size);
	}
	
	public void enqueue(MyData d) { // add
		queue.addLast(d);
	}
	
	public MyData dequeue() {
		return queue.removeFirst();
	}
	
	public boolean empty() {
		return queue.sizeOf() == 0;
	}
	
	public void showQueue() {
		System.out.println(queue.toString());
		System.out.println(queue.capacity());
	}

	public static void main(String[] args) {
		MyArrayQueue me = new MyArrayQueue(10);
		
		me.enqueue(new MyData("abc", 1));
		me.enqueue(new MyData("def", 2));
		me.enqueue(new MyData("ghi", 3));
		me.showQueue();
		System.out.println(me.dequeue());
		System.out.println(me.dequeue());
		
		for (int i = 0; i < 100; i++) {
			me.enqueue(new MyData("" + i, i));
			System.out.println(me.dequeue());
		}
		me.showQueue();
	}

}
