package algorithm;

import java.util.Scanner;

public class CodeUp1266{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] num = new int[input];
        int sum = 0;
        for(int i=0; i<input; i++) {
        	num[i] = scanner.nextInt();
        	sum += num[i];
        }
        
        System.out.println(sum);
        scanner.close();
    }
}
