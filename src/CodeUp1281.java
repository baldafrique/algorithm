package algorithm;

import java.util.Scanner;

public class CodeUp1281{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = 0;
        
        for(int i=num1; i<=num2; i++) {
        	if((i == num1) && (i%2 !=0)) {
        		result += i;
        		System.out.print(i);
        	}
        	else if(i%2 == 0) {
        		result -= i;
        		System.out.print("-" + i);
        	}
        	else {
        		result += i;
        		System.out.print("+" + i);
        	}
        }
        System.out.println("=" + result);
        
        scanner.close();
    }
}
