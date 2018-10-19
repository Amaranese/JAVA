package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P285_LasVacasPensantes {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		String in;
		while (!(in = br.readLine()).equals("0")) {
			int[] comidas = new int[Integer.parseInt(in)];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < comidas.length; i++) {
				comidas[i] = Integer.parseInt(st.nextToken());
			}
			int[][] memoria = new int[comidas.length][comidas.length];
			for (int i = 0; i < memoria.length; i++) {
				Arrays.fill(memoria[i], -1);
			}
			System.out.println(maximoComidas(0, comidas.length - 1, comidas, memoria));
		}
	}

	private static int maximoComidas(int i, int j, int[] comidas, int[][] memoria) {
		if (memoria[i][j] == -1) {
			if (i == j) {
				memoria[i][j] = comidas[i];
			} else if (i == j - 1) {
				memoria[i][j] = Math.max(comidas[i], comidas[j]);
			} else {
				int auxIzqI, auxDerI, auxIzqJ, auxDerJ;
				if (comidas[i + 1] >= comidas[j]) {
					auxIzqI = i + 2;
					auxDerI = j;
				} else {
					auxIzqI = i + 1;
					auxDerI = j - 1;
				}
				if (comidas[i] >= comidas[j - 1]) {
					auxIzqJ = i + 1;
					auxDerJ = j - 1;
				} else {
					auxIzqJ = i;
					auxDerJ = j - 2;
				}
				memoria[i][j] = Math.max(comidas[i] + maximoComidas(auxIzqI, auxDerI, comidas, memoria),
										 comidas[j] + maximoComidas(auxIzqJ, auxDerJ, comidas, memoria));
			}
		}
		return memoria[i][j];
	}

}
