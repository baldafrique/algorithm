package algorithm;

import java.util.Scanner;

public class CodeUp1229{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextFloat();
        double weight = scanner.nextFloat();
        double standard;
        double fatness1;
        
        if(height < 150) standard = height - 100;
        else if(height < 160) standard = (height-150)/2 + 50;
        else standard = (height-100) * 0.9;
        
        fatness1 = (weight-standard) * 100 / standard;
        String fatness2 =  String.format("%.2f", fatness1);
        fatness1 = Double.parseDouble(fatness2);
        
        if(fatness1 <= 10) System.out.println("정상");
        else if(fatness1 <= 20) System.out.println("과체중");
        else System.out.println("비만");
        
        scanner.close();
    }
}
