package codeUp;

import java.util.Scanner;

public class CodeUp1168{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int birthdate = scanner.nextInt();
        int gender = scanner.nextInt();
        
        if(gender < 3) {
        	System.out.println(113 - birthdate/10000);
        }
        else {
        	System.out.println(13 - birthdate/10000);
        }
        
        scanner.close();
    }
}
