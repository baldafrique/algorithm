package codeUp;

import java.util.Scanner;

public class CodeUp1409 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];
    for(int i=0; i<10; i++) numbers[i] = scanner.nextInt();
    int number = scanner.nextInt();
    
    System.out.println(numbers[number-1]);
    
    scanner.close();
    }
}