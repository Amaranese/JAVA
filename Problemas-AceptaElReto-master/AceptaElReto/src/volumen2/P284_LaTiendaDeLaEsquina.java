package volumen2;

import java.io.IOException;
import java.util.Scanner;

public class P284_LaTiendaDeLaEsquina {

	static Scanner reader = new Scanner(System.in);
	static int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };

	public static void main(String[] args) throws IOException {
		int n = reader.nextInt();
		for (int i = 0; i < n; i++) {
			int price = reader.nextInt();
			int paid = reader.nextInt();
			int difference = paid - price;
			if (difference < 0) {
				System.out.println("DEBE " + (-difference));
			} else {
				StringBuilder output = new StringBuilder(40);
				int j = 0;
				int numCoins = 0;
				while (j < coins.length) {
					while (difference >= coins[j]) {
						numCoins++;
						difference -= coins[j];
					}
					output.append(numCoins).append(' ');
					numCoins = 0;
					j++;
				}
				output.setCharAt(output.length() - 1, '\n');
				System.out.print(output);
			}
		}
	}

}
