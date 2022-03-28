package dataStructuresAlgorithms;

public class HanoiTower {
	
	private void move(int n, int i, int j) {
		if (n == 1) {
			System.out.println("Plate " + n + " : " + i + " → " + j);
			return;
		}
		else {
			int k = 3 - (i + j);
			move(n - 1, i, k);
			System.out.println("Plate " + n + " : " + i + " → " + j);
			move(n - 1, k, j);
		}
		
	}

	public static void main(String[] args) {
		
		HanoiTower myT = new HanoiTower();
		
		myT.move(3, 0, 1);
	}

}
