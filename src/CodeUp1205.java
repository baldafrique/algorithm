package algorithm;

import java.util.Scanner;

public class CodeUp1205{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double[] num = new double[8];
        
        num[0] = num1 + num2;
        num[1] = num1 - num2;
        num[2] = num2 - num1;
        num[3] = num1 * num2;
        num[4] = num1 / num2;
        num[5] = num2 / num1;
        num[6] = Math.pow(num1, num2);
        num[7] = Math.pow(num2, num1);
        
        double max = num[0];
        for(int i=1; i<8; i++) {
        	if(max < num[i]) max = num[i];
        }
        
        System.out.printf("%.6f", max);
        scanner.close();
    }
}
