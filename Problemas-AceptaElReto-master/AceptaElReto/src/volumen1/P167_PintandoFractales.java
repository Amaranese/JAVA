package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P167_PintandoFractales {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder lados = new StringBuilder(1000);
	static final int LADOS_CUADRADO = 4;

	public static void main(String[] args) throws IOException {
		String valor;
		while ((valor = entrada.readLine()) != null) {
			lados.append(ladosFractal(Integer.parseInt(valor))).append('\n');
		}
		System.out.print(lados);
	}

	private static int ladosFractal(int ladoMayor) {
		int total = ladoMayor * LADOS_CUADRADO;
		if (ladoMayor > 1) {
			total += ladosFractal(ladoMayor / 2) * LADOS_CUADRADO;
		}
		return total;
	}

}
