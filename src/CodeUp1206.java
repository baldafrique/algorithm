package algorithm;

import java.util.Scanner;

public class CodeUp1206{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if(num1 % num2 == 0) {
        	System.out.println(num2 + "*" + num1/num2 + "=" + num1);
        }
        else if(num2 % num1 == 0) {
        	System.out.println(num1 + "*" + num2/num1 + "=" + num2);
        }
        else {
        	System.out.println("none");
        }
        
        scanner.close();
    }
}
