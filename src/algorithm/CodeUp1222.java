package algorithm;

import java.util.Scanner;

public class CodeUp1222{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        
        while(time < 90) {
        	time += 5;
        	score1++;
        }
        
        if(score1 > score2) System.out.println("win");
        else if(score1 < score2) System.out.println("lose");
        else System.out.println("same");
        
        scanner.close();
    }
}
