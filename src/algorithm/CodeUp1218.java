package algorithm;

import java.util.Scanner;

public class CodeUp1218{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] side = new double[3];
        double temp;
        
        for(int i=0; i<3; i++) side[i] = scanner.nextInt();
        
        if((side[0] == side[1]) && (side[1] == side[2])) {
        	System.out.println("정삼각형");
        	scanner.close();
        	return;
        }
        
        for(int i=0; i<2; i++) {
        	for(int j=0; j<2; j++) {
        		if(side[j] > side[j+1]) {
        			temp = side[j];
        			side[j] = side[j+1];
        			side[j+1] = temp;
        		}
        	}
        }
        
        if(side[2] < side[0] + side[1]) {
        	for(int i=0; i<2; i++) {
            	for(int j=1; j<3; j++) {
            		if(i==j) continue;
            		else if(side[i] == side[j]) {
            			System.out.println("이등변삼각형");
            			scanner.close();
            			return;
            		}
            	}
            }
        	
        	if(Math.pow(side[0], 2.0) == Math.pow(side[1], 2.0) + Math.pow(side[2], 2.0)) {
            	System.out.println("직각삼각형");
            	scanner.close();
            	return;
            }
            else if(Math.pow(side[1], 2.0) == Math.pow(side[2], 2.0) + Math.pow(side[0], 2.0)) {
            	System.out.println("직각삼각형");
            	scanner.close();
            	return;
            }
            else if(Math.pow(side[2], 2.0) == Math.pow(side[0], 2.0) + Math.pow(side[1], 2.0)) {
            	System.out.println("직각삼각형");
            	scanner.close();
            	return;
            }
        	
        	System.out.println("삼각형");
        }
        else System.out.println("삼각형아님");
        
        scanner.close();
    }
}
