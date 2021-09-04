// WIP

package algorithm;

import java.util.Scanner;

public class CodeUp1282{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int k = 1;
        
        for(int i=2; i<n; i++) {
            for(; k<n; k++) {
            	if(Math.pow(i, 2) == n-k) {
            		a = i;
            	}
            }
        }
        
        System.out.println(k + " " + a);

        
        scanner.close();
    }
}
