// WIP

package codeUp;

import java.util.Scanner;

public class CodeUp1275{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double k = scanner.nextDouble();
        double result = Math.pow(n, k);
        String result2 = String.format("%.0f", result);
        
        if(k == 0) System.out.println("1");
        else {
        	System.out.println(result2);
        }

        scanner.close();
    }
}
