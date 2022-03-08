package codeUp;

import java.util.Scanner;

public class CodeUp1212{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        int temp;
        
        for(int i=0; i<3; i++) num[i] = scanner.nextInt();
        
        for(int i=0; i<2; i++) {
        	for(int j=0; j<2; j++) {
        		if(num[j] > num[j+1]) {
        			temp = num[j];
        			num[j] = num[j+1];
        			num[j+1] = temp;
        		}
        	}
        }
        
        if(num[2] < num[0] + num[1]) System.out.println("yes");
        else System.out.println("no");
        scanner.close();
    }
}
