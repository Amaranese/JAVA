package volumen3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P305_NosInvanden {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (reader.hasNext()) {
			int n = reader.nextInt();
			int[] invaders = new int[n];
			for (int i = 0; i < invaders.length; i++) {
				invaders[i] = reader.nextInt();
			}
			int[] defenders = new int[n];
			for (int i = 0; i < defenders.length; i++) {
				defenders[i] = reader.nextInt();
			}
			
			Arrays.sort(invaders);
			Arrays.sort(defenders);
			
			int defendedCities = 0;
			int i = defenders.length - 1;
			int j = invaders.length - 1;
			while (i >= 0 && j >= 0) {
				while (j >= 0 && defenders[i] < invaders[j]) {
					j--;
				}
				if (j >= 0 && defenders[i] >= invaders[j]) {
					defendedCities++;
					j--;
				}
				i--;
			}
			System.out.println(defendedCities);
		}
	}

}
