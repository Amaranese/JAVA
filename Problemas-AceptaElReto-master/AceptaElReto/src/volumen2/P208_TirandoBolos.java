package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P208_TirandoBolos {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static String cero = "0 0";
	static StringBuilder salida = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		String valor;
		while (!(valor = entrada.readLine()).equals(cero)) {
			StringTokenizer tokenizer = new StringTokenizer(valor);
			int filas = Integer.parseInt(tokenizer.nextToken());
			int filaBolo = Integer.parseInt(tokenizer.nextToken());
			System.out.println(bolos(filas) - bolos(filas - filaBolo + 1));
		}
	}

	private static long bolos(int lado) {
		long cuadrado = (long) lado * (long) lado;
		return (cuadrado - lado) / 2 + lado;
	}

}
