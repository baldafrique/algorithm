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
	
	public void set(int index, int data) {
		// index에 해당하는 노드를 탐색
		Node temp = listPointer;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		// 해당 노드의 값을 data로 변경
		temp.value = data;
	}
	
	public int get(int index) {
		// index에 해당하는 노드를 탐색
		Node temp = listPointer;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		// 해당 노드의 값을 반환
		return temp.value;
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = listPointer;
		listPointer = newNode;
		size++;
	}
	
	public void addLast(int data) {
		// 새로운 노드 생성
		Node newNode = new Node(data);
		
		// 가장 마지막 노드를 탐색
		Node temp = listPointer;
		for (int i = 0; i < size - 1; i++) {
			temp = temp.next;
		}
		
		// 가장 마지막 노드의 다음 노드의 주소를 가르키는 포인터인 
		// next에 새 노드의 주소값을 할당
		temp.next = newNode;
		size++;
	}
	
	public void add(int index, int data) {
		// 새로운 노드 생성
		Node newNode = new Node(data);
		newNode.value = data;
		
		// index 바로 전 노드를 탐색
		Node temp = listPointer;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		// 뒷 노드의 주소값을 앞의 노드의 next가 갖고 있고
		// 두 노드 사이에 newNode가 들어가므로 newNode의 next에
		// 앞의 노드의 next를 할당하고 난 뒤
		// 앞의 노드의 next는 newNode를 가르켜야 하므로
		// 앞의 노드의 next에 newNode를 할당한다.
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}
	
	public int removeData(int data) { // reduce size
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
		// 두번째 노드가 첫번째 노드로
		listPointer = listPointer.next;
		size--;
	}
	
	public void removeLast() {
		// 마지막 노드를 삭제한다는 것은 
		// 뒤에서 두번째 노드의 next를 null로 만드는 것을 의미
		
		// 뒤에서 두번째 노드를 탐색
		Node temp = listPointer;
		for (int i = 0; i < size - 2; i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}
	
	public void remove(int index) {
		// 첫번째 노드를 삭제하려는 경우
		if (index == 0) {
			removeFirst();
		}
		else {
			// index에 해당하는 노드를 삭제한다는 것은
			// index - 1에 해당하는 노드의 next가
			// index + 1에 해당하는 노드를 가르키도록 하는 것
			Node temp = listPointer;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
			size--;
		}
	}
	
	public int indexOf(int data) {
		Node temp = listPointer;
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (temp.value == data) {
				return index;
			}
			else {
				temp = temp.next;
				index++;
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
