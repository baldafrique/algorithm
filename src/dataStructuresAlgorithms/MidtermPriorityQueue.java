package midTermEx;

/*
 Solution 
 - add() : 
 기본적으로 자바의 라이브러리인 Deque을 활용하여 enqueue에 해당하는 작업(Deque.add())을 해주면 된다.
 
 - showQueue() :
 showQueue() 메소드의 경우 iteration을 사용하여 끝 요소까지 순차적으로 탐색하면서 빈 문자열("")에 
 각각의 요소의 toString() 메소드의 리턴값(MyData.toString()을 의미함)을 계속해서 붙여준 뒤 마지막 요소까지 완료했다면 리턴한다.
 
 - addPriority() :
 기본적인 접근방식은 어떤 값을 addPriority() 한다는 것은 Queue에서 
 나보다 priority가 낮은 data들은 모두 내 뒤로 보내야 한다는 점을 이용한다.
 0. 현재 addPriority()로 enqueue하려는 Mydata를 A라고 하자.
 1. Queue의 맨 마지막 요소부터 시작해서 A와 priority를 비교한다.
 2. 만약 A.prioirty가 비교하려는 대상의 prioirty보다 크다면 그 데이터보다 앞에 가 있어야 하므로 Queue에서 꺼내서 Stack에 저장한다.
 3. A 앞에 자신보다 우선순위가 높거나 혹은 A의 앞에 아무 요소가 존재하지 않는다면 지금까지 A보다 우선순위가 낮아서 Queue에서 제거된 뒤
 Stack에 저장해두었던 값들을 A의 뒤에 순차적으로 붙인다. 이때, 이 값들이 Queue에 있던 순서를 그대로 유지시키기 위해서 Stack을 사용하였다.  
 */

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class MidtermPriorityQueue {
	
	Deque<MyData> deque = new LinkedList<>();

	private void add(MyData data) {
		deque.add(data);
	}
	
	private void addPriority(MyData data) {
		Stack<MyData> stack = new Stack<>();
		while (!deque.isEmpty() && deque.peekLast().priority < data.priority) {
			stack.push(deque.pollLast());
		}
		deque.add(data);
		while (!stack.isEmpty()) {
			deque.add(stack.pop());
		}
	}

	private void showQueue() {
		Iterator<MyData> iterator = deque.iterator();
		String ret = "";
		while (iterator.hasNext()) {
			ret += iterator.next().toString();
		}
		System.out.println(ret);
	}

	public static void main(String[] args) {
		MidtermPriorityQueue pq = new MidtermPriorityQueue();
		
		pq.add(pq.new MyData(3, "ddd"));
		pq.addPriority(pq.new MyData(1, "paaa"));
		pq.add(pq.new MyData(1, "aaa"));
		pq.addPriority(pq.new MyData(5, "pccc"));
		pq.add(pq.new MyData(2, "bbb"));
		pq.add(pq.new MyData(5, "ccc"));
		pq.addPriority(pq.new MyData(2, "pbbb"));
		pq.addPriority(pq.new MyData(3, "pddd"));
		pq.showQueue();
		
		// ==> pccc(5) ddd(3) paaa(1) aaa(1) bbb(2) ccc(5) pddd(3) pbbb(2) 	
	}
	
	
	public class MyData{
		int priority;
		String name;
		MyData(int p, String s){
			priority=p;
			name=s;
		}
		public boolean equals(MyData that) {
			if (this.name==that.name)
				return true;
			else
				return false;
		}
		int compareTo(MyData that) {
			if (this.priority>that.priority)
				return 1;
			else if (this.priority<that.priority)
				return -1;
			else
				 return 0;
		}
		public String toString() {
			return name+"("+priority+") ";
		}
	}

}
