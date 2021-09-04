package algorithm;

import java.util.Scanner;

public class CodeUp1204{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        System.out.print(num);
        if((num%10 == 0 || num%10 > 3) || (10 < num && num < 14)) System.out.println("th");
        else if(num%10 == 1) System.out.println("st");
        else if(num%10 == 2) System.out.println("nd");
        else if(num%10 == 3) System.out.println("rd");
        
        scanner.close();
    }
}
