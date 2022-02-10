package algorithm;

import java.util.Scanner;

public class CodeUp1286{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int temp;
        
        for(int i=0; i<5; i++) num[i] = scanner.nextInt();
        for(int i=0; i<4; i++) {
        	for(int j=0; j<4; j++) {
        		if(num[j] > num[j+1]) {
        			temp = num[j];
        			num[j] = num[j+1];
        			num[j+1] = temp;
        		}
        	}
        }
        
        System.out.println(num[4]);
        System.out.println(num[0]);
        scanner.close();
    }
}
