package dataStructuresAlgorithms;

public class MyLinkedList3 {
	NodeDL head, tail;
	int size;
	
	public MyLinkedList3() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void add(MyData data) { // save data at the end of array
		addLast(data);
	}
	
	public void addFirst(MyData data) {
		NodeDL newNode = new NodeDL(data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.right = head;
			head.left = newNode;
			head = newNode;
		}
		size++;
	}

	public void addLast(MyData data) {
		NodeDL newNode = new NodeDL(data);
		// head나 tail이 null인 경우 노드가 없음을 의미
		// head == tail인 경우 노드가 1개임을 의미
		
		if (tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.left = tail;
			tail.right = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void add(int index, MyData data) { // index < size
		if (checkIndexValidation(index)) {
			if (index == 0) {
				addFirst(data);
			}
			else {
				NodeDL temp = head;
				for (int i = 0; i < index; i++) {
					temp = temp.right;
				}
				NodeDL newNode = new NodeDL(data);
				newNode.right = temp;
				newNode.left = temp.left;
				temp.left.right = newNode;
				temp.left = newNode;
				size++;
			}
		}
		else if (index == size) {
			addLast(data);
		}
	}
	
	private boolean checkIndexValidation(int index) {
		return index >= 0 && index < size ? true : false;
	}
	
	public MyData removeFirst() {
		if (head != null) {
			MyData ret = head.data;
			removeANode(head);
			return ret;
		}
		else {
			return null;
		}
	}
	
	public MyData removeLast() {
		if (tail != null) {
			MyData ret = tail.data;
			removeANode(tail);
			return ret;
		}
		else {
			return null;
		}
	}
	
	public MyData remove(int index) {
		if (checkIndexValidation(index)) {
			NodeDL temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.right;
			}
			MyData ret = temp.data;
			removeANode(temp);
			return ret;
		}
		else {
			return null;
		}
	}

	private void removeANode(NodeDL temp) {
		if (head == temp) {
			if (tail == temp) { 
				head = null;
				tail = null;
			}
			else {
				head = head.right;
				head.left = null;
			}
		}
		else {
			if (tail == temp) {
				tail = tail.left;
				tail.right = null;
			}
			else {
				temp.right.left = temp.left;
				temp.left.right = temp.right;
			}
		}
		size--;
	}
	
	public boolean remove(MyData data) {
		NodeDL temp = head;
		while (temp != null) {
			if (temp.data.equals(data)) {
				removeANode(temp);
				return true;
			}
			else {
				temp = temp.right;
			}
		}
		return false;
	}
	
	public String toString() {
		String ret = "";
		NodeDL temp = head;
		while (temp != null) {
			ret += temp.data.toString() + " ";
			temp = temp.right;
		}
		return ret;
	}
	
	public int indexOf(MyData data) {
		NodeDL temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.data.equals(data)) {
				return i;
			}
			temp = temp.right;
		}
		return -1;
	}
	
	public MyData get(int index) {
		if (checkIndexValidation(index)) {
			NodeDL temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.right;
			}
			return temp.data;
		}
		else {
			return null;
		}
	}
	
	public void set(int index, MyData data) {
		if (checkIndexValidation(index)) {
			NodeDL temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.right;
			}
			temp.data = data;
		}
	}
	
	public int sizeOf() {
		return size;
	}
	
	public void sort() {
		MyLinkedList3 tempList = new MyLinkedList3();
		NodeDL temp = head;
		while (temp != null) {
			tempList.addInOrder(temp.data);
			temp = temp.right;
		}
		this.head = tempList.head;
		this.tail = tempList.tail;
	}

	private void addInOrder(MyData data) {
		if (head == null || data.compareTo(head.data) > 0) { // newNode가 가장 앞에 위치할 경우
			addFirst(data);
		}
		else {
			NodeDL newNode = new NodeDL(data);
			NodeDL temp = head;
			while (temp != null && temp.data.compareTo(data) > 0) {
				temp = temp.right;
			}
			if (temp != null) { // newNode가 head와 tail 사이에 위치하는 경우
				temp.left.right = newNode;
				newNode.left = temp.left;
				temp.left = newNode;
				newNode.right = temp;
			}
			else { // newNode가 가장 뒤에 위치해야 하는 경우
				newNode.left = tail;
				tail.right = newNode;
				tail = newNode;
			}
		}
	}
	
	
}
