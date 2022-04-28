package doItDataStructuresAlgorithms;

import java.util.Scanner;

public class LinkedListTester {
	static Scanner stdIn = new Scanner(System.in);
	
	static class Data {
		static final int NO = 1; // 번호를 입력 받습니까?
		static final int NAME = 2; // 이름을 입력 받습니까?
		
		private Integer no; // 회원번호
		private String name; // 이름
		
		public String toString() {
			return "(" + no + ") " + name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide + "할 데이터를 입력하세요.");
			
			if ((sw & NO) == NO) {
				System.out.print("번호 : ");
				no = stdIn.nextInt();
			}
			
			if ((sw & NAME) == NAME) {
				System.out.print("이름 : ");
				name = stdIn.next();
			}
		}
	}

}
