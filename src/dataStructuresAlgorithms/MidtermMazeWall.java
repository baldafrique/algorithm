package dataStructuresAlgorithms;

public class MidtermMazeWall {
	int [][] maze;
	int [][] cost;
	int callCount;
	public MidtermMazeWall(int[][] input) {
		maze = input;
		
		int row = maze.length;
		int col = maze[0].length;
		cost = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = col; j < col; j++) {
				maze[i][j] = 0;
			}
		}
	}
	public void resetCount() {
		callCount=0;
	}
	public int getCount() {
		return callCount;
	}
	
	// 1
	public int minCost(int i, int j) { // return min. cost from (0,0) to (i,j)
		callCount++;
		
		if (i == 0 && j == 0) {
			return maze[i][j];
		}
		
		if (i == 0) {
			return maze[i][j] + minCost(i, j - 1);
		}
		
		if (j == 0) {
			return maze[i][j] + minCost(i - 1, j);
		}
		
		return maze[i][j] + Math.min(minCost(i, j - 1), minCost(i - 1, j));
	}
	
	// 2
	private int minCostAll(int i, int j) {
		callCount++;
		// cost[i][j]가 0이 아닌 경우는 이미 계산한 적이 있다는 것이므로 그 값을 그대로 사용
		if (cost[i][j] != 0) { 
			return cost[i][j];
		}
		// cost[i][j]가 0인 경우, 처음 계산하는 것이므로 계산한 값을 cost[i][j]에 memo함
		else { 
			if (i == 0 && j == 0) {
				cost[i][j] = maze[i][j];
				return maze[i][j];
			}
			
			if (i == 0) {
				cost[i][j] = maze[i][j] + minCostAll(i, j - 1);
				return maze[i][j] + minCostAll(i, j - 1);
			}
			
			if (j == 0) {
				cost[i][j] = maze[i][j] + minCostAll(i - 1, j);	
				return maze[i][j] + minCostAll(i - 1, j);
			}
			
			cost[i][j] = maze[i][j] + Math.min(minCostAll(i, j - 1), minCostAll(i - 1, j));
			return maze[i][j] + Math.min(minCostAll(i, j - 1), minCostAll(i - 1, j));
		}
	}
	
	public void showCost() {
		for (int i = 0; i<cost.length; i++) {
			for (int j = 0; j<cost.length; j++)
				System.out.printf("%5d",cost[i][j]);
			System.out.println();
		}
	}
	
	
	// 3
	String ret = "";
	public String pathToString(int i, int j) {
//		String ret="("+i+","+j+") ";
		temp(i, j);
		return ret;
	}
	
	public int temp(int i, int j) { 
		if (i == 0 && j == 0) {
			ret += "("+i+","+j+") ";
			return maze[i][j];
		}
		
		if (i == 0) {
			ret += "("+i+","+(j-1)+") ";
			return maze[i][j] + temp(i, j - 1);
		}
		
		if (j == 0) {
			ret += "("+(i-1)+","+(j)+") ";
			return maze[i][j] + temp(i - 1, j);
		}
		
		if (maze[i][j-1] < maze[i-1][j]) {
			ret += "("+(i)+","+(j-1)+") ";
		}
		else {
			ret += "("+(i-1)+","+(j)+") ";
		}
		return maze[i][j] + Math.min(temp(i, j - 1), temp(i - 1, j));
	}

	public static void main(String[] args) {
		int [][] input = { { 3,  2,  5,   1,   4,  3,  6 },
						   { 2, 999,999,  5,  999,999, 1 },
						   { 5, 999, 9,   6,   3,  5,  4 },
						   { 1, 999, 3,   8,   6,  1,  7 },
						   { 7, 999, 8,  999,  9,  2,  2 },
						   { 8,  6,  2,  999,  6,  9,  5 },
						   { 2,  1,  7,   2,   4,  3,  1 },
		};
		
		MidtermMazeWall pf = new MidtermMazeWall(input);
		
		System.out.println("2-1) MinimumCost = "+pf.minCost(input.length-1, input.length-1));
		System.out.println("Recursive Call Count = "+pf.getCount());
		pf.resetCount();
		System.out.println("2-2) Cost Matrix");
		pf.minCostAll(input.length-1, input.length-1);
		System.out.println("2-1) MinimumCost = "+pf.minCostAll(input.length-1, input.length-1));
		pf.showCost();
		System.out.println("Recursive Call Count with Cost Matrix = "+pf.getCount());
		System.out.println("2-3) Minimum Cost Path");
		System.out.println(pf.pathToString(input.length-1, input.length-1));

	}
// 2-4) 시간복잡도 답안
//  1)의 경우 O(n^2)
//
//  2)의 경우 O(n)

}

