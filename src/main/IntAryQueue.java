package main;

public class IntAryQueue {

	private int max; // 큐 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체
	
	public IntAryQueue(int capacity) {
		max = capacity;
		num = 0;
		que = new int[max];
	}
	
	public int enqueue(int x) {
		return que[num++] = x;
	}
	
	public int dequeue() {
		int x = que[0];
		for (int i = 0; i < num; i++) {
			que[i] = que[i + 1];
		}
		return x;
	}
}
