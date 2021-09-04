package algorithm;

import java.util.Scanner;

public class CodeUp1269{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int initial = scanner.nextInt();
        int ratio = scanner.nextInt();
        int difference = scanner.nextInt();
        int number = scanner.nextInt();
        int next = 0;
        
        if(number == 1) System.out.println(initial);
        else {
            for(int i=2; i<=number; i++) {
            	next = initial * ratio + difference; 
            	initial = next;
            }
            System.out.println(next);
        }
        scanner.close();
    }
}
