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
	
	public int add(int data) {
		return addFirst(data);
	}
	
	public int addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = listPointer;
		listPointer = newNode;
		size++;
		return 0;
	}
	
	public int remove(int data) {
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
