package volumen1;

import java.util.Scanner;

public class P129_Marcadores7Segmentos {

	private static boolean[][] representacion = new boolean[][] {
			{ true, true, true, true, true, true, false }, // 0
			{ false, false, true, true, false, false, false }, // 1
			{ false, true, true, false, true, true, true }, // 2
			{ false, true, true, true, true, false, true }, // 3
			{ true, false, true, true, false, false, true }, // 4
			{ true, true, false, true, true, false, true }, // 5
			{ true, true, false, true, true, true, true }, // 6
			{ false, true, true, true, false, false, false }, // 7
			{ true, true, true, true, true, true, true }, // 8
			{ true, true, true, true, true, false, true }, // 9
			{ false, false, false, false, false, false, false }, // Apagado
	};

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int digitoActual;
		while ((digitoActual = entrada.nextInt()) != -1) {
			int digitoAnterior = 10;
			int totalCambios = calculaCambios(digitoAnterior, digitoActual);
			digitoAnterior = digitoActual;
			int digitos = 1;
			while ((digitoActual = entrada.nextInt()) != -1) {
				totalCambios += calculaCambios(digitoAnterior, digitoActual);
				digitoAnterior = digitoActual;
				digitos++;
			}
			totalCambios += calculaCambios(digitoAnterior, 10);
			totalCambios *= digitos;
			System.out.println(totalCambios);
		}
	}

	private static int calculaCambios(int digitoAnterior, int digitoActual) {
		int cambios = 0;
		for (int i = 0; i < representacion[digitoAnterior].length; i++) {
			if (representacion[digitoAnterior][i] != representacion[digitoActual][i]) {
				cambios++;
			}
		}
		return cambios;
	}

}
