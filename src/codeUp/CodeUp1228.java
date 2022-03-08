package codeUp;

import java.util.Scanner;

public class CodeUp1228{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextFloat();
        double weight = scanner.nextFloat();
        double standard = (height-100) * 0.9;
        double fatness1 = (weight - standard) * 100 / standard;
        String fatness2 =  String.format("%.2f", fatness1);
        fatness1 = Double.parseDouble(fatness2);
        
        if(fatness1 <= 10) System.out.println("정상");
        else if(fatness1 <= 20) System.out.println("과체중");
        else System.out.println("비만");
        
        scanner.close();
    }
}
