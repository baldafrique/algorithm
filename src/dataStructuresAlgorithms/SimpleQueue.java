package dataStructuresAlgorithms;

public class SimpleQueue {
	int[] queue;
	int front, rear;
	int maxSize;
	int size;
	
	public SimpleQueue(int n) {
		maxSize = n;
		queue = new int[n];
		front = 0;
		rear = 1;
	}
	
	public void enqueue(int d) { // add
		if (rear == front) {
			System.out.println("Queue Full");
		}
		else {
			queue[rear] = d;
			rear = (rear + 1) % maxSize;
			size++;
		}
	}
	
	public int dequeue() {
		if (empty()) {
			System.out.println("Queue Empty");
			return -999;
		}
		else {
			front = (front + 1) % maxSize;
			size--;
			return queue[front];
		}
	}
	
	public boolean empty() {
		return (front + 1) % maxSize == rear;
	}
	
	public void showQueue() {
		for (int i = 0; i < maxSize; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println("f=" + front + " r=" + rear + " size=" + size);
	}
	
	public static void main(String[] args) {
		SimpleQueue me = new SimpleQueue(10);
		
		for (int i = 0; i < 100; i++) {
			if (Math.random() > 0.5) {
				me.enqueue(i);
			}
			else {
				me.dequeue();
			}
			me.showQueue();
		}
	}

}
