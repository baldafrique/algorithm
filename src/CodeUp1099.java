package algorithm;

import java.util.Scanner;

public class CodeUp1099 {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] maze = new int[SIZE][SIZE];
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				maze[i][j] = scanner.nextInt();
			}
		}
		
		int x=1;
		int y=1;
		
		for(int i=0; i<1; i++) {
			
		}
		
		
		while(true) {
			if(maze[1][1] == 2) {
				maze[1][1] = 9;
				break;
			}
			else {
				maze[1][1] = 9;
			}
			
			if(maze[x][y+1] != 1) {
				if(maze[x][y+1] == 2) {
					maze[x][y+1] = 9;
					break;
				}
				else {
					maze[x][y+1] = 9;
					y++;
				}
			}
			else if(maze[x+1][y] != 1) {
				if(maze[x+1][y] == 2) {
					maze[x+1][y] = 9;
					break;
				}
				else {
					maze[x+1][y] = 9;
					x++;
				}
			}
			else {
				break;
			}
		}
		
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}