package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P205_NumerosDeLychrel {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		String numeroStr;
		int numero;
		int pasos;
		siguiente: for (int i = 0; i < n; i++) {
			numeroStr = entrada.readLine();
			numero = Integer.parseInt(numeroStr);
			pasos = 0;
			while (numero < 1000000000) {
				numero += Integer.parseInt(new StringBuilder(numeroStr).reverse().toString());
				numeroStr = Integer.toString(numero);
				pasos++;
				if (esCapicua(numeroStr)) {
					System.out.println(pasos + " " + numero);
					continue siguiente;
				}
			}
			System.out.println("Lychrel?");
		}
	}

	private static boolean esCapicua(String digitos) {
		for (int i = 0; i < digitos.length() / 2; i++) {
			if (digitos.charAt(i) != digitos.charAt(digitos.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
