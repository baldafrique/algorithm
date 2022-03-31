package dataStructuresAlgorithms;

public class MyALMain {

	public static void main(String[] args) {
		MyArrayList1 me = new MyArrayList1();
		
		for (int i = 0; i < 20; i++) {
			me.add((int) (Math.random() * 100));
		}
		
		System.out.println(me.toString());
	}

}
