package algorithm;

import java.util.Scanner;

public class CodeUp1122{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();
        int minute = 0;
        
        while(second >= 60) {
        	second -= 60;
        	minute++;
        }
        
        System.out.println(minute + " " + second);
        scanner.close();
    }
}