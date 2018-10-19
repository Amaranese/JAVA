package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P125_NumerosVampiro {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			compruebaNumeroVampiro(entrada.readLine());
		}
	}

	private static void compruebaNumeroVampiro(String numero) {
		if (numero.length() % 2 == 0) {
			List<Character> candidatos = new ArrayList<>(numero.length());
			for (int i = 0; i < numero.length(); i++) {
				candidatos.add(numero.charAt(i));
			}
			boolean[] vampiro = new boolean[1];
			compruebaNumeroVampiroAux(numero, candidatos, new StringBuilder(), new StringBuilder(), vampiro);
			if (vampiro[0]) {
				System.out.println("SI");
			} else {
				System.out.println("NO"); 
			}
		} else {
			System.out.println("NO"); 
		}
	}

	private static void compruebaNumeroVampiroAux(String numero, List<Character> candidatos, StringBuilder colmillo1,
			StringBuilder colmillo2, boolean[] vampiro) {
		if (colmillo1.length() + colmillo2.length() == numero.length()) {
			int c1 = Integer.parseInt(colmillo1.toString());
			int c2 = Integer.parseInt(colmillo2.toString());
			int n = Integer.parseInt(numero);
			vampiro[0] = c1 * c2 == n;
//			if (vampiro[0]) {
//				System.out.println(colmillo1 + " * " + colmillo2 + " = " + (c1 * c2));
//			}
		} else {
			for (int i = 0; i < candidatos.size(); i++) {
				if (!vampiro[0]) {
					
					char digito = candidatos.get(i);

					if (colmillo1.length() == colmillo2.length()) {
						colmillo1.insert(0, digito);
					} else {
						colmillo2.insert(0, digito);
					}
					candidatos.remove(i);

					if (colmillo1.length() > colmillo2.length()
							|| validaSolucionParcial(numero, colmillo1, colmillo2)) {
						compruebaNumeroVampiroAux(numero, candidatos, colmillo1, colmillo2, vampiro);
					}

					if (colmillo1.length() == colmillo2.length()) {
						colmillo2.deleteCharAt(0);
					} else {
						colmillo1.deleteCharAt(0);
					}
					candidatos.add(i, digito);

				}
			}
		}
	}

	private static boolean validaSolucionParcial(String numero, StringBuilder colmillo1, StringBuilder colmillo2) {
		String producto = String.valueOf(Integer.parseInt(colmillo1.toString()) * Integer.parseInt(colmillo2.toString()));
		boolean sigueValido = true;
		int inicio = Math.min(colmillo1.length(), producto.length()) - 1;
		for (int i = inicio; i >= 0 && sigueValido; i--) {
			sigueValido = producto.charAt(producto.length() - (i + 1)) == numero.charAt(numero.length() - (i + 1));
		}
		return !(colmillo1.charAt(colmillo1.length() - 1) == '0' && colmillo2.charAt(colmillo2.length() - 1) == '0')
				&& sigueValido;
	}

}
