package dataStructuresAlgorithms;

public class MidtermMyLinkedList3Recursion {

	NodeDL head, tail;
	int size;

	public MidtermMyLinkedList3Recursion() {
		head=null;
		tail=null;
		size=0;
	}

	private boolean checkIndexValidation(int index) {
		return (index>=0 && index<size)? true:false;
	}
	
	public void add(MyData data) { //save data at the end of array
		addLast(data);
	}
	
	public void addLast(MyData data) {
		NodeDL newNode = new NodeDL(data);
		if (tail==null) {
			tail=newNode;
			head=newNode;
		}
		else {
			newNode.left=tail;
			tail.right=newNode;
			tail=newNode;
		}
		size++;
	}
	public void addFirst(MyData data) {
		NodeDL newNode = new NodeDL(data);
		if (head==null) {
			tail=newNode;
			head=newNode;
		}
		else {
			newNode.right=head;
			head.left=newNode;
			head=newNode;
		}
		size++;
	}

	public void add(int index, MyData data) {  // index<=size
		if (checkIndexValidation(index)) {
			if (index==0)
				addFirst(data);
			else {
				NodeDL temp = head;
				for (int i=0;i<index;i++)
					temp=temp.right;
				NodeDL newNode = new NodeDL(data);
				newNode.right=temp;
				newNode.left=temp.left;
				temp.left.right=newNode;
				temp.left=newNode;
				size++;
			}	
		}
		else if(index==size)
			addLast(data);
	}
	
	public MyData removeFirst() {
		if (head!=null) {
			MyData ret=head.data;
			removeANode(head);
			return ret;
		}
		else
			return null;
	}
	
	public MyData removeLast() {
		if (tail!=null) {
			MyData ret=tail.data;
			removeANode(tail);
			return ret;
		}
		else
			return null;
	}
		
	public MyData remove(int index) {
		if (checkIndexValidation(index)) {
			NodeDL temp = head;
			for (int i=0;i<index;i++)
				temp=temp.right;
			MyData ret = temp.data;
			removeANode(temp);
			return ret;
		}
		else
			return null;
	}
	
	private void removeANode(NodeDL temp) {
		if (head==temp) {
			if (tail==temp) {
				head=null;
				tail=null;
			}
			else {
				head=head.right;
				head.left=null;
			}
		}
		else {
			if (tail==temp) {
				tail=tail.left;
				tail.right = null;
			}
			else {
				temp.right.left = temp.left;
				temp.left.right = temp.right;
			}
		}
		size--;
	}
////////////////////////////////////////////////////////////////
	public int indexOf(MyData data) {
		return indexOf(data,head, 0);
	}
	
	private int indexOf(MyData data, NodeDL head2, int i) {
		return repeat1(data, head2, 0); 
	}
	
	private int repeat1(MyData data, NodeDL node, int i) {
		// recursion method for indexOf()
		// base condition1 : data??? ?????? ??????
		// base condition2 : ???????????? ????????? ???????????? ????????? data??? ?????? ??????
		if (head == null) { // data ????????? ?????? ?????? return -1
			return -1;
		}
		// case of base coniditon1 -> return index
		else if (node.data.equals(data)) {
			return i;
		}
		// case of base condition2 -> return -1
		else if (node == tail && !node.data.equals(data)) { 
			return -1;
		}
		else {
			return repeat1(data, node.right, ++i);
		}
	}

	public boolean remove(MyData data) {
		return remove(data, head);
	}
	private boolean remove(MyData data, NodeDL head2) {
		if (indexOf(data) == -1) {
			System.out.println("The data doesn't exist...");
			return false;
		}
		else {
			NodeDL node = repeat2(data, head2);
			if (head == node) {
				if (tail == node) { 
					head = null;
					tail = null;
				}
				else {
					head = head.right;
					head.left = null;
				}
			}
			else {
				if (tail == node) {
					tail = tail.left;
					tail.right = null;
				}
				else {
					node.right.left = node.left;
					node.left.right = node.right;
				}
			}
			size--;
			return true;
		}
		
	}
	
	private NodeDL repeat2(MyData data, NodeDL node) {
		// recursion method for remove()
		// ??????????????? ?????? ?????? ??? ??????
		// base condition1 : ?????? node??? ???????????? data??? ?????? ?????? node??? ???
		// base condition2 : node??? tail(????????? ??????)????????? data??? ?????? ?????? ?????? ???
		if (node.data.equals(data)) {
			// case of base condition1
			return node;
		}
		else if (node == tail && !node.data.equals(data)) {
			// case of base condition2
			return null;
		}
		else {
			return repeat2(data, node.right); 
		}
	}

	public String toString() {
		return toString(head);
	}
	
	private String toString(NodeDL head2) {
		String ret = "";
		return repeat3(head2, ret);
	}
	
	private String repeat3(NodeDL node, String ret) {
		// base condition : ????????? tail??? ??????
		// head?????? ????????? ??????????????? String??? ?????????????????? tail??? ????????????
		// ???????????? ???????????? ???????????? ???????????? ?????? ??? ??????
		if (node == tail) {
			return ret += node.data.toString();
		}
		else {
			ret += node.data.toString();
			return repeat3(node.right, ret);
		}
	}
////////////////////////////////////////////////////////////////

	public MyData get(int index) {
		if (checkIndexValidation(index)) {
			NodeDL temp = head;
			for (int i=0;i<index;i++)
				temp=temp.right;
			return temp.data;
		}
		else
			return null;
	}
}