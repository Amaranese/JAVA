package volumen2;

import java.util.Scanner;

public class P249_ElBurroYLasAlforjas {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int n = entrada.nextInt();
		for (int i = 0; i < n; i++) {
			int donkeys = entrada.nextInt();
			int numBags = entrada.nextInt();
			int[] bags = new int[20000];
			for (int j = 0; j < numBags; j++) {
				bags[entrada.nextInt() - 1]++;
			}
			int numDonkeys = 0;
			for (int weight : bags) {
				int pairs = weight / 2;
				if (pairs >= donkeys) {
					numDonkeys += donkeys;
					break;
				} else {
					numDonkeys += pairs;
					donkeys -= pairs;
				}
			}
			System.out.println(numDonkeys);
		}
	}

}
