package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P416_MichaelJFoxYElPatoDonald {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		String nStr;
		while (!(nStr = entrada.readLine()).equals("0")) {
			boolean[][] memoria = new boolean[31][12];
			String[] fechas = entrada.readLine().split(" ");
			boolean diaMesRepetido = false;
			for (int i = 0; i < fechas.length && !diaMesRepetido; i++) {
				int dia = Integer.parseInt(fechas[i].substring(0, fechas[i].indexOf('/')));
				fechas[i] = fechas[i].substring(fechas[i].indexOf('/') + 1, fechas[i].length());
				int mes = Integer.parseInt(fechas[i].substring(0, fechas[i].indexOf('/')));
				if (!memoria[dia - 1][mes - 1]) {
					memoria[dia - 1][mes - 1] = true;
				} else {
					diaMesRepetido = true;
				}
			}
			if (diaMesRepetido) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

}
