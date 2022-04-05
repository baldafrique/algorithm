package dataStructuresAlgorithms;

public class MyLLMain {

	public static void main(String[] args) {
//		MyLinkedList0 me = new MyLinkedList0();
		MyLinkedList1 me = new MyLinkedList1();
		
		for (int i = 0; i < 20; i++) {
//			me.add((int) (Math.random() * 100));
			me.add(i);
		}
		
		System.out.println(me.toString());
		me.remove(3);
		System.out.println(me.toString());
	}

}
