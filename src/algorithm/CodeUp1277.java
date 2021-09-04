package algorithm;

import java.util.Scanner;

public class CodeUp1277{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] data = new int[num];
        for(int i=0; i<num; i++) data[i] = scanner.nextInt();
        System.out.print(data[0] + " " + data[num/2] + " " + data[num-1]);
        scanner.close();
    }
}
