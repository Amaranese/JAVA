package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P140_SumaDigitos {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		StringBuilder salida = new StringBuilder();
		while (!(entrada = br.readLine()).startsWith("-")) {
			char[] cifras = entrada.toCharArray();
			int suma = 0;
			for (int i = 0; i < cifras.length; i++) {
				suma += Character.getNumericValue(cifras[i]);
				if (i == cifras.length - 1) {
					salida.append(cifras[i] + " = ");
				} else {
					salida.append(cifras[i] + " + ");
				}
			}
			salida.append(suma + "\n");
		}
		System.out.print(salida.toString());
	}

}
