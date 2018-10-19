package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P102_EncriptacionDeMensajes {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String vocales = "aeiouAEIOU";
	private static String fin = "FIN";

	public static void main(String[] args) throws IOException {
		while (true) {
			String mensajeCodificado = entrada.readLine();
			String mensajeOriginal = decodifica(mensajeCodificado.charAt(0),
					mensajeCodificado.substring(1, mensajeCodificado.length()));
			if (mensajeOriginal.equals(fin)) {
				break;
			}
			int vocales = 0;
			for (int i = 0; i < mensajeOriginal.length(); i++) {
				if (esVocal(mensajeOriginal.charAt(i))) {
					vocales++;
				}
			}
			System.out.println(vocales);
		}

	}

	private static boolean esVocal(char letra) {
		return vocales.indexOf(letra) != -1;
	}

	private static String decodifica(char codigo, String mensaje) {
		StringBuilder mensajeOriginal = new StringBuilder(mensaje.length());
		int diferencia = 'p' - codigo;
		for (int i = 0; i < mensaje.length(); i++) {
			if ((mensaje.charAt(i) >= 65 && mensaje.charAt(i) <= 90)
					|| (mensaje.charAt(i) >= 97 && mensaje.charAt(i) <= 122)) {
				char caracterDecodificado = (char) (mensaje.charAt(i) + diferencia);
				if (Character.isUpperCase(mensaje.charAt(i))) {
					if (caracterDecodificado < 65) { // < 'A'
						caracterDecodificado = (char) (91 - (65 - caracterDecodificado));
					} else if (caracterDecodificado > 90) { // > 'Z'
						caracterDecodificado = (char) (64 + (caracterDecodificado - 90));
					}
				} else {
					if (caracterDecodificado < 97) { // < 'a'
						caracterDecodificado = (char) (123 - (97 - caracterDecodificado));
					} else if (caracterDecodificado > 122) { // > 'z'
						caracterDecodificado = (char) (96 + (caracterDecodificado - 122));
					}
				}
				mensajeOriginal.append(caracterDecodificado);
			} else {
				mensajeOriginal.append(mensaje.charAt(i));
			}
		}
		return mensajeOriginal.toString();
	}

}
