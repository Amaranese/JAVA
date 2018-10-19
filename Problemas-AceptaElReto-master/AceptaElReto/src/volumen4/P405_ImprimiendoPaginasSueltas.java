package volumen4;

import java.io.IOException;
import java.util.Scanner;

public class P405_ImprimiendoPaginasSueltas {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int inicio;
		while ((inicio = entrada.nextInt()) != 0) {
			StringBuilder salida = new StringBuilder(1000);
			int fin = inicio;
			int actual;
			do {
				actual = entrada.nextInt();
				if (actual == fin + 1) {
					fin = actual;
				} else {
					if (inicio == fin) {
						salida.append(inicio);
					} else {
						salida.append(inicio).append('-').append(fin);
					}
					salida.append(',');
					inicio = actual;
					fin = actual;
				}
			} while (actual != 0);
			salida.setCharAt(salida.length() - 1, '\n');
			System.out.print(salida);
		}
	}

}
