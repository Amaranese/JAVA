package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P410_DigitosSaltarines {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String saltarines = "SALTARINES";
	private static String normales = "NORMALES";

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			char[] digitos = entrada.readLine().toCharArray();
			boolean[] visitados = new boolean[digitos.length];
			int j = 0;
			int porVisitar = digitos.length;
			while (!visitados[j]) {
				visitados[j] = true;
				j = (j + Character.getNumericValue(digitos[j])) % digitos.length;
				porVisitar--;
			}
			if (j == 0 && porVisitar == 0) {
				System.out.println(saltarines);
			} else {
				System.out.println(normales);
			}
		}
	}

}
