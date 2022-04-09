import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon15720 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		int[] A = new int[3];
		int beforeDis = 0;
		int afterDis;
		int rest = 0;
		
		A[0] = Integer.parseInt(str.split(" ")[0]);
		A[1] = Integer.parseInt(str.split(" ")[1]);
		A[2] = Integer.parseInt(str.split(" ")[2]);
		
		ArrayList<Integer> burgers = new ArrayList<>();
		ArrayList<Integer> sides = new ArrayList<>();
		ArrayList<Integer> drinks = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			str = reader.readLine();
			for (int j = 0; j < A[i]; j++) {
				if (i == 0) {
					burgers.add(Integer.parseInt(str.split(" ")[j]));
				}
				else if (i == 1) {
					sides.add(Integer.parseInt(str.split(" ")[j]));
				}
				else {
					drinks.add(Integer.parseInt(str.split(" ")[j]));
				}
			}
		}
		
		while (!burgers.isEmpty() && !sides.isEmpty() && !drinks.isEmpty()) {
			int burger = Collections.max(burgers);
			int side = Collections.max(sides);
			int drink = Collections.max(drinks);
			
			burgers.remove(burgers.indexOf(burger));
			sides.remove(sides.indexOf(side));
			drinks.remove(drinks.indexOf(drink));
			
			beforeDis += burger + side + drink;
		}
		
		while (!burgers.isEmpty()) {
			rest += burgers.get(0);
			burgers.remove(0);
		}
		
		while (!sides.isEmpty()) {
			rest += sides.get(0);
			sides.remove(0);
		}
		
		while (!drinks.isEmpty()) {
			rest += drinks.get(0);
			drinks.remove(0);
		}
		
		afterDis = (int) (beforeDis * 0.9 + rest);
		beforeDis += rest;
		
		writer.write(beforeDis + "\n" + afterDis);
		writer.flush();
		reader.close();
		writer.close();
	}
}
