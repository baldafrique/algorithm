package dataStructuresAlgorithms;

public class MyLLMain {

	public static void main(String[] args) {
		MyLinkedList1 me = new MyLinkedList1();
//		MyLinkedList0 me = new MyLinkedList0();
		
		for (int i = 0; i < 20; i++) {
			me.addFirst(i);
		}
		
		System.out.println(me.toString());
//		System.out.println(me.get(0));
//		me.set(0, 1);
//		System.out.println(me.indexOf(0));
//		me.addLast(1);
//		me.add(2, 2);
//		me.removeFirst();
//		me.removeLast();
//		me.remove(0);
		
	}

}
