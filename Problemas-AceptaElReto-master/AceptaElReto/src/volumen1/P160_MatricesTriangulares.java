package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P160_MatricesTriangulares {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String nStr;
		while (!(nStr = entrada.readLine()).equals("0")) {
			int n = Integer.parseInt(nStr);
			int[][] matriz = new int[n][n];
			for (int i = 0; i < n; i++) {
				String[] fila = entrada.readLine().split(" ");
				for (int j = 0; j < n; j++) {
					matriz[i][j] = Integer.parseInt(fila[j]);
				}
			}
			if (esMatrizTriagular(true, matriz) || esMatrizTriagular(false, matriz)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean esMatrizTriagular(boolean flag, int[][] matriz) {
		int inicioI, finI, inicioJ, finJ;
		if (flag) {
			inicioI = 0;
			finI = matriz.length - 1;
			inicioJ = 1;
			finJ = matriz.length;
		} else {
			inicioI = 1;
			finI = matriz.length;
			inicioJ = 0;
			finJ = 1;
		}
		for (int i = inicioI; i < finI; i++) {
			for (int j = inicioJ; j < finJ; j++) {
				if (matriz[i][j] != 0) {
					return false;
				}
			}
			if (flag) {
				inicioJ++;
			} else {
				finJ++;
			}
		}
		return true;
	}

}
