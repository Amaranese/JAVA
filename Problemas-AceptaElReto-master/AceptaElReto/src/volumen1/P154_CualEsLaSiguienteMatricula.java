package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P154_CualEsLaSiguienteMatricula {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String matricula;
		while (!(matricula = entrada.readLine()).equals("9999 ZZZ")) {
			String[] numerosLetras = matricula.split(" ");
			int numeros = Integer.parseInt(numerosLetras[0]);
			numeros = (numeros + 1) % 10000;
			if (numeros == 0) {
				numerosLetras[1] = siguiente(numerosLetras[1]);
			}
			StringBuilder numerosSb = new StringBuilder(Integer.toString(numeros));
			while (numerosSb.length() < 4) {
				numerosSb.insert(0, '0');
			}
			System.out.println(numerosSb.toString() + " " + numerosLetras[1]);
		}

	}

	private static String siguiente(String letras) {
		StringBuilder letrasSb = new StringBuilder(letras);
		boolean propagar = false;
		int i = letrasSb.length() - 1;
		do {
			char letra = letrasSb.charAt(i);
			do {
				letra++;
				if ((int) letra == 91) {
					letra = 'B';
					propagar = true;
				} else {
					propagar = false;
				}
			} while (esVocal(letra));
			letrasSb.setCharAt(i, letra);
			i--;
		} while (i >= 0 && propagar);
		return letrasSb.toString();
	}

	private static boolean esVocal(char letra) {
		return "AEIOU".indexOf(letra) != -1;
	}

}
