package volumen4;

import java.io.IOException;
import java.util.Scanner;

public class P411_SobreLaTelaDeUnaArana {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int pesoMaximo;
		while ((pesoMaximo = entrada.nextInt()) != 0) {
			int elefantes = 0;
			int peso;
			while ((peso = entrada.nextInt()) != 0) {
				if (peso <= pesoMaximo) {
					pesoMaximo -= peso;
					elefantes++;
				} else {
					pesoMaximo = 0;
				}
			}
			System.out.println(elefantes);
		}
	}

}
