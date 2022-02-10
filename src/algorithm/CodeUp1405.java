package algorithm;

import java.util.Scanner;

public class CodeUp1405{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        for(int i=0; i<num; i++) input[i] = scanner.nextInt();
        
        for(int i=0; i<num; i++) {
        	for(int j=0; j<num; j++) {
        		if(j+i < num) System.out.print(input[j+i] + " ");
        		else System.out.print(input[(j+i) % num] + " ");
        	}
        	System.out.println();
        }
        scanner.close();
    }
}