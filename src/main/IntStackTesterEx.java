package main;

import java.util.Scanner;

public class IntStackTesterEx {

	public static void main(String[] args) {
		IntStack s = new IntStack(100);
		Scanner stdIn = new Scanner(System.in);
		int menu = 0;
		int x;
		
		while (menu != 8) {
			System.out.print("1. push 2. pop 3. peek 4. indexOf 5. clear 6. info 7. dump 8. quit : ");
			menu = stdIn.nextInt();
			
			switch (menu) {
			case 1: // push
				System.out.print("data : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("stack is full.");
				}
				break;
			case 2: // pop
				try {
					System.out.println(s.pop());
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("stack is empty.");
				}
				break;
			case 3: // peek
				try {
					System.out.println(s.peek());
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("stack is empty.");
				}
				break;
			case 4: // indexOf
				System.out.println("data : ");
				x = stdIn.nextInt();
				int n = s.indexOf(x);
				
				if (n < 0) {
					System.out.println("no data");
				}
				else {
					System.out.println(n);
				}
				break;
			case 5:  // clear
				s.clear();
				break;
			case 6: // capacity 
				System.out.println("capacity : " + s.capacity());
				System.out.println("num of data : " + s.size());
				System.out.println((s.isEmpty() ? "" : "not ") + "empty.");
				System.out.println((s.isFull() ? "" : "not ") + "full.");
				break;
			case 7: // dump
				s.dump();
			}
		}
		
		stdIn.close();
	}

}
