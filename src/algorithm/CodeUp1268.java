package algorithm;

import java.util.Scanner;

public class CodeUp1268{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int temp;
        int even = 0;
        
        for(int i=0; i<input; i++) {
        	temp = scanner.nextInt();
        	if(temp%2 == 0) even++;
        }
        
        System.out.println(even);
        scanner.close();
    }
}
