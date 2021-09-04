// WIP

package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1231{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] input1 = input.split("");
        String[] input2;
        String[] input3;        
        int input4;
        int input5;
        String input6;
        String input7;
        
        for(int i=0; i<input1.length; i++) {
        	if(input1[i]== "+") {
        		input2 = Arrays.copyOfRange(input1, 0, i);
        		input3 = Arrays.copyOfRange(input1, i+1, input1.length+1);
        		input6 = input2.toString();
        		input7 = input3.toString();
        		input4 = Integer.parseInt(input6);
        		input5 = Integer.parseInt(input7);
        		System.out.println(input4+input5);
        	}
        	else if(input1[i]== "-") {
        		input2 = Arrays.copyOfRange(input1, 0, i);
        		input3 = Arrays.copyOfRange(input1, i+1, input1.length-1);
        		input6 = input2.toString();
        		input7 = input3.toString();
        		input4 = Integer.parseInt(input6);
        		input5 = Integer.parseInt(input7);
        		System.out.println(input4-input5);
        	}
        	else if(input1[i]== "*") {
        		input2 = Arrays.copyOfRange(input1, 0, i);
        		input3 = Arrays.copyOfRange(input1, i+1, input1.length-1);
        		input6 = input2.toString();
        		input7 = input3.toString();
        		input4 = Integer.parseInt(input6);
        		input5 = Integer.parseInt(input7);
        		System.out.println(input4*input5);
        	}
        	else if(input1[i]== "/") {
        		input2 = Arrays.copyOfRange(input1, 0, i);
        		input3 = Arrays.copyOfRange(input1, i+1, input1.length-1);
        		input6 = input2.toString();
        		input7 = input3.toString();
        		input4 = Integer.parseInt(input6);
        		input5 = Integer.parseInt(input7);
        		System.out.println(input4/input5);
        	}
        }
        scanner.close();
    }
}
