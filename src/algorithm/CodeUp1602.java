package algorithm;

import java.util.Scanner;

public class CodeUp1602 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double num = scanner.nextDouble();
    num = absolute(num);
    if(num == (int)num) System.out.println(String.format("%.0f", num));
    else System.out.println(num);
    scanner.close();
    }
    
    public static double absolute(double num) {
    	if(num > 0) return num;
    	else if(num == 0) return 0;
    	else return num * (-1);
    }
}

