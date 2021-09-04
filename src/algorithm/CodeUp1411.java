package algorithm;

import java.util.Scanner;

public class CodeUp1411 {
    public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();
	    int temp;
	    int[] num = new int[input];
	    
	    for(int j=0; j<input-1; j++) {
	    	temp = scanner.nextInt();
		    for(int i=0; i<input; i++) {
		    	if(temp == i+1) num[i] = temp;
		    }
	    }
	    
	    for(int i=0; i<input; i++) if(num[i] == 0) System.out.println(i+1);
	    
	    
	    scanner.close();
    }
}