package dataStructuresAlgorithms;


public class TestMain {

	public static void main(String[] args) {
		MyArrayList2 al = new MyArrayList2();
		
		al.add(new MyData("xyz", 10));
		al.add(new MyData("abc", 10));
		al.add(new MyData("def", 20));
		al.add(new MyData("ghi", 30));
		al.add(new MyData("jkl", 40));
		
		System.out.println(al.toString());
		System.out.println(al.indexOf(new MyData("abc", 20)));
		System.out.println(al.get(0));
		al.set(2, new MyData("mno", 50));
		System.out.println(al.toString());
		al.add(3, new MyData("pqr", 60));
		System.out.println(al.toString());
		al.remove(2);
		System.out.println(al.toString());
		al.remove(new MyData("ghi", 30));
		System.out.println(al.toString());
		al.sort();
		System.out.println(al.toString());
		
		MyLinkedList2 ll = new MyLinkedList2();
		
		ll.add(new MyData("xyz", 10));
		ll.add(new MyData("abc", 10));
		ll.add(new MyData("def", 20));
		ll.add(new MyData("ghi", 30));
		ll.add(new MyData("jkl", 40));
		
		System.out.println(ll.toString());
		
		System.out.println(ll.indexOf(new MyData("abc", 20)));
		System.out.println(ll.get(0));
		ll.set(2, new MyData("mno", 50));
		System.out.println(ll.toString());
		ll.add(3, new MyData("pqr", 60));
		System.out.println(ll.toString());
		ll.remove(2);
		System.out.println(ll.toString());
		ll.remove(new MyData("ghi", 30));
		System.out.println(ll.toString());
		ll.sort();
		System.out.println(ll.toString());
	}

}
