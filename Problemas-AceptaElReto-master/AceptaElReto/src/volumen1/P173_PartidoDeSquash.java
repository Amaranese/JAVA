package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P173_PartidoDeSquash {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String resultado;
		while (!(resultado = entrada.readLine()).equals("F")) {
			int[] marcador = new int[2];
			char ganadorPuntoAnterior = 'A';
			boolean setFinalizado = false;
			StringBuilder sets = new StringBuilder(20);
			for (int i = 0; i < resultado.length() - 1; i++) {
				setFinalizado = false;
				char ganadorPuntoActual = resultado.charAt(i);
				if (ganadorPuntoActual == ganadorPuntoAnterior) {
					if (ganadorPuntoActual == 'A') {
						marcador[0]++;
					} else {
						marcador[1]++;
					}
				} else {
					ganadorPuntoAnterior = ganadorPuntoActual;
				}
				if ((marcador[0] >= 9 || marcador[1] >= 9) && Math.abs(marcador[0] - marcador[1]) >= 2) {
					sets.append(marcador[0]).append('-').append(marcador[1]).append(' ');
					marcador[0] = 0;
					marcador[1] = 0;
					setFinalizado = true;
				}
			}
			if (!setFinalizado) {
				sets.append(marcador[0]).append('-').append(marcador[1]).append('\n');
			} else {
				sets.setCharAt(sets.length() - 1, '\n');
			}
			System.out.print(sets);
		}
	}

}
