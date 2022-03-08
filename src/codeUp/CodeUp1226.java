package codeUp;

import java.util.Scanner;

public class CodeUp1226{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] win = new int[7];
        int[] num = new int[6];
        int count = 0;
        boolean bonus = false;
        
        for(int i=0; i<7; i++) win[i] = scanner.nextInt();
        for(int i=0; i<6; i++) num[i] = scanner.nextInt();
        
        for(int i=0; i<7; i++) {
        	for(int j=0; j<6; j++) {
        		if(i == 6) {
        			if(win[i] == num[j]) bonus = true;
        		}
        		else {
        			if(win[i] == num[j]) count++;
        		}
        		
        	}
        }
        
        if(count == 6) System.out.println("1");
        else if(count == 5) {
        	if(bonus == true) System.out.println("2");
        	else System.out.println("3");
        }
        else if(count == 4) System.out.println("4");
        else if(count == 3) System.out.println("5");
        else System.out.println("0");
        
        scanner.close();
    }
}
