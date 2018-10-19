package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P180_Triangulos {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String espacio = " ";
	private static String imposible = "IMPOSIBLE\n";
	private static String acutangulo = "ACUTANGULO\n";
	private static String rectangulo = "RECTANGULO\n";
	private static String obtusangulo = "OBTUSANGULO\n";
	private static StringBuilder salida = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String[] lados = entrada.readLine().split(espacio);
			int h = Integer.parseInt(lados[0]);
			int c1 = Integer.parseInt(lados[1]);
			int c2 = Integer.parseInt(lados[2]);

			if (c1 >= h) {
				int temp = c1;
				c1 = h;
				h = temp;
			}
			if (c2 >= h) {
				int temp = c2;
				c2 = h;
				h = temp;
			}

			if (h >= c1 + c2) {
				salida.append(imposible);
			} else {
				int hCuadrado = h * h;
				int sumaCatetosCuadrado = c1 * c1 + c2 * c2;
				if (hCuadrado < sumaCatetosCuadrado) {
					salida.append(acutangulo);
				} else if (hCuadrado == sumaCatetosCuadrado) {
					salida.append(rectangulo);
				} else {
					salida.append(obtusangulo);
				}
			}
		}
		System.out.print(salida);
	}

}
