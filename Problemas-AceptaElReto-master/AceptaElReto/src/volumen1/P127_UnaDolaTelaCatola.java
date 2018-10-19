package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P127_UnaDolaTelaCatola {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String[] valores = entrada.readLine().split(" F ");
			String[] nombres = valores[0].split(" ");
			String[] camasPalabrasCancion = valores[1].split(" ");
			int camasLibres = Integer.parseInt(camasPalabrasCancion[0]);
			int palabras = Integer.parseInt(camasPalabrasCancion[1]);
			if (camasLibres == 0) {
				System.out.println("NADIE TIENE CAMA");
			} else if (camasLibres >= nombres.length) {
				System.out.println("TODOS TIENEN CAMA");
			} else {
				int personas = nombres.length;
				int palabrasCancion;
				int palabrasPronunciadas;
				int j = -1;
				while (personas > camasLibres) {
					palabrasCancion = palabras % personas == 0 ? palabras : palabras % personas;
					palabrasPronunciadas = 0;
					while (palabrasPronunciadas < palabrasCancion) {
						j = (j + 1) % nombres.length;
						while (nombres[j] == null) {
							j = (j + 1) % nombres.length;
						}
						palabrasPronunciadas++;
					}
					nombres[j] = null;
					personas--;
				}
				StringBuilder salida = new StringBuilder(49);
				j = camasLibres;
				int k = 0;
				while (j > 0) {
					if (nombres[k] != null) {
						salida.append(nombres[k]).append(' ');
						j--;
					}
					k++;
				}
				salida.replace(salida.length() - 1, salida.length(), "\n");
				System.out.print(salida);
			}
		}
	}

}
