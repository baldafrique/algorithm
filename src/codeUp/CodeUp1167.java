package codeUp;

import java.util.Scanner;

public class CodeUp1167{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        int temp;
        
        for(int i=0; i<3; i++) numbers[i] = scanner.nextInt();
        
        for(int i=0; i<2; i++) {
        	for(int j=0; j<2; j++) {
        		if(numbers[j] > numbers[j+1]) {
        			temp = numbers[j];
        			numbers[j] = numbers[j+1];
        			numbers[j+1] = temp;
        		}
        	}
        }
        
        System.out.println(numbers[1]);
        
        scanner.close();
    }
}
