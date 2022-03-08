package codeUp;

import java.util.Scanner;

public class CodeUp1210{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[2];
        num[0] = scanner.nextInt();
        num[1] = scanner.nextInt();
        int sum = 0;
        
        for(int i=0; i<2; i++) {
        	if(num[i] == 1) sum += 400;
        	else if(num[i] == 2) sum += 340;
        	else if(num[i] == 3) sum += 170;
        	else if(num[i] == 4) sum += 100;
        	else sum += 70;
        }
        
        if(sum > 500) System.out.println("angry");
        else System.out.println("no angry");
        scanner.close();
    }
}
