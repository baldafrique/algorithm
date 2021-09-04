package algorithm;

import java.util.Scanner;

public class CodeUp1410 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    int left = 0;
    int right = 0;
    
    for(int i=0; i<input.length(); i++) {
    	if(input.charAt(i) == '(') left++;
    	else right++;
    }
    
    System.out.println(left + " " + right);
    scanner.close();
    }
}