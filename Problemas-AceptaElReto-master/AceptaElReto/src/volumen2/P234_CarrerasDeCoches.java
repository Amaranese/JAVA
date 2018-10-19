package volumen2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P234_CarrerasDeCoches {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = reader.nextInt();
		for (int i = 0; i < n; i++) {
			int size = reader.nextInt();
			int v = reader.nextInt();
			int[] voltages = new int[size];
			for (int j = 0; j < voltages.length; j++) {
				voltages[j] = reader.nextInt();
			}
			Arrays.sort(voltages);
			int j = 0;
			int k = voltages.length - 1;
			int numCars = 0;
			int vAux;
			while (j < k) {
				do {
					vAux = voltages[j] + voltages[k];
					j++;
				} while (j < k && vAux < v);
				if (vAux >= v) {
					numCars++;
				}
				k--;	
			}
			System.out.println(numCars);
		}
	}

}
