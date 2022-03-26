package main;

public class Tmp {

	public static void main(String[] args) {
		
		int[][] mat1 = new int[3][3];
		char[][] mat2 = new char[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat1[i][j] = 1;
				mat2[i][j] = '*';
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat2[i][j]);
			}
			System.out.println();
		}
	}

}
