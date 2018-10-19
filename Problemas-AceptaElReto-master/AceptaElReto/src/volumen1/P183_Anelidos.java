package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P183_Anelidos {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String espacio = " ";
	private static String an = "AN";
	private static String na = "NA";

	public static void main(String[] args) throws IOException {
		String[] valor;
		while (true) {
			valor = entrada.readLine().split(espacio);
			if (valor[1].equals("C")) {
				break;
			}
			String anillos = valor[1].substring(0, valor[1].length() - 1);
			imprimeAnillos(Integer.parseInt(valor[0]), anillos);
			System.out.println("C");
		}
	}

	private static void imprimeAnillos(int faseFinal, String anillos) {
		if (faseFinal == 0) {
			System.out.print(anillos);
		} else {
			for (int i = 0; i < anillos.length(); i++) {
				imprimeAnillosAux(1, faseFinal, anillos.charAt(i));
			}
		}
	}

	private static void imprimeAnillosAux(int faseInicial, int faseFinal, char color) {
		if (faseInicial == faseFinal) {
			if (color == 'A') {
				System.out.print(an);
			} else {
				System.out.print(na);
			}
		} else {
			if (color == 'A') {
				imprimeAnillosAux(faseInicial + 1, faseFinal, 'A');
				imprimeAnillosAux(faseInicial + 1, faseFinal, 'N');
			} else {
				imprimeAnillosAux(faseInicial + 1, faseFinal, 'N');
				imprimeAnillosAux(faseInicial + 1, faseFinal, 'A');
			}
		}
	}

}
