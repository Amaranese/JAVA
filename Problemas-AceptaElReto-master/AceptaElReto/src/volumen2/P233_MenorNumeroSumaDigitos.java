package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P233_MenorNumeroSumaDigitos {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String valor;
		while (!(valor = entrada.readLine()).equals("0")) {
			int n = Integer.parseInt(valor);
			int nueves = (int) (n / 9);
			StringBuilder menorNumeroSb = new StringBuilder(112);
			int resto = n % 9;
			if (resto > 0) {
				menorNumeroSb.append(resto);
			}
			for (int i = 0; i < nueves; i++) {
				menorNumeroSb.append('9');
			}
			System.out.println(menorNumeroSb.toString());
		}
	}
}