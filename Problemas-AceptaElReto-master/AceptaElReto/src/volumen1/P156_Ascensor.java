package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P156_Ascensor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		while (!(entrada = br.readLine()).startsWith("-")) {
			StringTokenizer chars = new StringTokenizer(entrada);
			int[] pisos = new int[chars.countTokens()];
			for (int j = 0; j < pisos.length; j++) {
				pisos[j] = Integer.parseInt(chars.nextToken());
			}
			int piso = 0;
			int suma = 0;
			while (pisos[piso + 1] != -1) {
				if (pisos[piso + 1] >= pisos[piso]) {
					suma += pisos[piso + 1] - pisos[piso];
				} else {
					suma += pisos[piso] - pisos[piso + 1];
				}
				piso++;
			}
			System.out.println(suma);
		}
	}

}
