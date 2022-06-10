package dataStructuresAlgorithms;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class FinalsWithdrawableStack {
	
	LinkedList<Integer> stack=new LinkedList<>();
	Stack<Integer> storage = new Stack<>();
	
	public void push(int d) {
		stack.push(d);
	}
	
	public int pop() {
		return stack.isEmpty() ? -1 : stack.pop();
	}
	
	public void withdraw(int d) {
		if (stack.contains(d)) {
			int element = stack.pop();
			
			while (element != d) {
				storage.push(element);
				element = stack.pop();
			}
			
			while (!storage.isEmpty()) {
				stack.push(storage.pop());	
			}
		}
		else 
			System.out.println("존재하지 않는 data : "+d);
	}
	
	public void showStack() {
		System.out.println(stack.toString());
	}
	
	public int size() {
		return stack.size(); 
	}

	public static void main(String[] args) {
		int max=30;
	
		FinalsWithdrawableStack s = new FinalsWithdrawableStack();
		
		Random rand1 = new Random(7);
		Random rand2 = new Random(21);
		ArrayList<Integer> data = new ArrayList<>() ;
		
		for (int i=0;i<max;i++) {
			if (rand1.nextInt(10)>=2) {
				int d=rand2.nextInt(1000);
				data.add(d);
				s.push(d);
				System.out.println(d+" is pushed ");
			}
			else {
				int del=s.pop();
				System.out.println(del+" is deleted ");
				data.remove(data.indexOf(del));
			}
		}
		System.out.println("current size is "+s.size()+"  "+data.size());
		
		for (int i=0;i<s.size()/2;i++) {
			s.showStack();
			System.out.println(data.get(2*i));

			s.withdraw(data.get(2*i));
			System.out.println("current size is "+s.size());

		}
		s.withdraw(1234);
	}
}
