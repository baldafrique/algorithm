package codeUp;

import java.util.Scanner;

public class CodeUp1272{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int h = scanner.nextInt();
        
        if(k%2 != 0) k = k/2+1;
        else k *= 5;
        if(h%2 != 0) h = h/2+1;
        else h *= 5;
        
        System.out.println(k+h);
        scanner.close();
    }
}
