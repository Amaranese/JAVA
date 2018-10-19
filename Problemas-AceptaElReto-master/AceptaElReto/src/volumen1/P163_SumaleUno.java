package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P163_SumaleUno {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String numero;
		while (!(numero = entrada.readLine()).equals("FIN")) {
			System.out.println(siguiente(numero));
		}
	}

	private static String siguiente(String numero) {
		StringBuilder numeroSb = new StringBuilder(numero);
		boolean propagar = false;
		int i = numeroSb.length() - 1;
		do {
			char digito = numeroSb.charAt(i);
			if (digito == 'F') {
				digito = '0';
				propagar = true;
			} else {
				if (digito == '9') {
					digito = 'A';
				} else {
					digito++;
				}
				propagar = false;
			}
			numeroSb.setCharAt(i, digito);
			i--;
		} while (i >= 0 && propagar);
		if (propagar) {
			numeroSb.insert(0, '1');
		}
		return numeroSb.toString();
	}

}
