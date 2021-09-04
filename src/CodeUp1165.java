package algorithm;

import java.util.Scanner;

public class CodeUp1165{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int score = scanner.nextInt();
        
        while(time < 90) {
        	time += 5;
        	score++;
        }
        
        System.out.println(score);
        
        scanner.close();
    }
}
