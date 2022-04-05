package dataStructuresAlgorithms;

public class MyLinkedList1 {
	private class Node {
		int value;
		Node next;
		
		private Node(int data) {
			value = data;
			next = null;
		}
	}
	
	Node listPointer;
	int size;
	
	public MyLinkedList1() {
		listPointer = null;
		size = 0;
	}
	
	public void set() {
		
	}
	
	public int get() {
		return -1;
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = listPointer;
		listPointer = newNode;
		size++;
	}
	
	public void addLast(int data) {
		
	}
	
	public void add(int data) {
		
	}
	
	public int removeData(int data) {
		int index = 0;
		if (listPointer == null) {
			return -1;
		}
		else if (listPointer.value == data) {
			listPointer = listPointer.next;
			return index;
		}
		Node p = listPointer;
		Node q = p.next;
		while (q != null) {
			index++;
			if (q.value == data) { // found!
				p.next = q.next;
				return index;
			}
			else {
				p = q;
				q = q.next;
			}
		}
		return -1;
	}
	
	public void removeFirst() {
		
	}
	
	public void removeLast() {
		
	}
	
	public void remove(int index) {
		
	}
	
	public int indexOf(int data) {
		return -1;
	}
	
	public String toString() {
		String ret = "";
		Node temp = listPointer;
		while (temp != null) {
			ret += temp.value + ", ";
			temp = temp.next;
		}
		return ret;
	}
}
